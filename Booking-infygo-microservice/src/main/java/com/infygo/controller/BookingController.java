package com.infygo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infygo.dto.FlightDTO;
import com.infygo.dto.PassengerDTO;
import com.infygo.service.BookingService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;




@RestController
@RequestMapping("/infygo/book")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	
	
	@Autowired
	RestTemplate template;
	
	
	
	@PostMapping("/{FlightId}/{UserId}")
	@CircuitBreaker(name = "BookingService", fallbackMethod= "getBookingFallback")
	public  ResponseEntity<List<PassengerDTO>> book(@PathVariable("FlightId")String fId,
			@PathVariable("UserId")String userId,
			@RequestBody List<PassengerDTO> listPassengerDto)
	{
		
		int numberOfSeats = listPassengerDto.size();
		
		FlightDTO flightDto = template.getForObject("http://FlightMS/flights/"+fId, FlightDTO.class);
		
		int flightAvailableSeat = Integer.parseInt(flightDto.getSeatCount());
		
		
		
		if(numberOfSeats<=flightAvailableSeat) {
			int updatedSeatCount = flightAvailableSeat-numberOfSeats;
			
			return bookingService.book(fId,userId,listPassengerDto,numberOfSeats,flightDto);
			
		}
		
		else {return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);}
	
		
		
	}
	
	public ResponseEntity<List<PassengerDTO>> getBookingFallback(String fId,
			String userId,
		List<PassengerDTO> listPassengerDto,Throwable throwable) 
	{
		
		
		return null;

	}

}
