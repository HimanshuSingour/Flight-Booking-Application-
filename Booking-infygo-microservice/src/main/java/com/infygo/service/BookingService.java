package com.infygo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infygo.dto.FlightDTO;
import com.infygo.dto.PassengerDTO;
import com.infygo.dto.TicketDTO;
import com.infygo.repository.PassengerRepository;
import com.infygo.repository.TicketRepository;


@Service
public class BookingService {
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	TicketRepository ticketRepo;
	
	@Autowired
	PassengerService passengerService;
	
	@Autowired
	TicketService ticketService;
	

	
	public  ResponseEntity<List<PassengerDTO>> book(String fId,String userId,List<PassengerDTO> listPassengerDto,int numberOfSeats,FlightDTO flightDto){
		
		
		TicketDTO ticketDto= ticketService.createTicket(fId,userId,numberOfSeats,flightDto);
		
		int pnr = ticketDto.getPnr();
		List<PassengerDTO> passengerDto = passengerService.createPassenger(pnr,listPassengerDto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(passengerDto);
		
		
		
		
	}
	
	
	
	
}
