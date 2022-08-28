package com.infygo.controller;

import java.sql.Date;
import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import com.infygo.dto.FlightDTO;
import com.infygo.entity.FlightEntity;
import com.infygo.service.FlightService;


@RestController
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/{flightId}")
	public FlightEntity getFlights(@PathVariable("flightId") String flightId)
	
	{
		if(flightId=="F102")
			throw new RuntimeException();
		return flightService.getFlights(flightId);
	}
	
	@GetMapping("source/{sources}")
	public  ResponseEntity<List<FlightDTO>> getFlightSources(@PathVariable("sources")String src)
	{
		return flightService.getSources(src);
	}
	
	@GetMapping("destination/{dest}")
	public ResponseEntity<List<FlightDTO>> getFlightDestinations(@PathVariable("dest") String destination)
	{
		return flightService.getDestinations(destination);
	}
	
	@RequestMapping(value = "/{source}/{destination}/{journeyDate}", method = RequestMethod.GET)
	public ResponseEntity<List<FlightDTO>> getFlightDetails(@PathVariable String source,
			HttpServletResponse response, @PathVariable String destination, @PathVariable Date journeyDate) {
		List<FlightDTO> availableFlights = flightService.getFlights(source, destination, journeyDate);
		return new ResponseEntity<List<FlightDTO>>(availableFlights, org.springframework.http.HttpStatus.OK);

	}

}
