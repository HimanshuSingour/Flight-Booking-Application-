package com.infygo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infygo.dto.FlightDTO;
import com.infygo.entity.FlightEntity;

import com.infygo.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	private ModelMapper mapper;
	
	
	//fetch all flight object of flightId
	public FlightEntity getFlights(String flightId)
	{
		return flightRepository.findById(flightId).get();
	}

	//fetch list of sources from flight
	public ResponseEntity<List<FlightDTO>> getSources(String src) {
		Optional<List<FlightEntity>> sourcesOpt = flightRepository.findFlightSources(src);
		if(sourcesOpt.isPresent()) {
			
			List<FlightEntity> sourcesEntity = sourcesOpt.get();
			
			  List<FlightDTO> sourcesDto =(List<FlightDTO>)sourcesEntity.stream().map(p->{
				  
				  FlightDTO dto = mapper.map(p, FlightDTO.class);
				  return dto;
				  
			  }).collect(Collectors.toList()) ;
				
			  return ResponseEntity.status(HttpStatus.ACCEPTED).body(sourcesDto);
			
		}
//		if(sources == null) throw new Exception;
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		
	}
	
	//fetch list of destination from flight
	public ResponseEntity<List<FlightDTO>> getDestinations(String dest){
		Optional<List<FlightEntity>> destinationsOpt = flightRepository.fingFlightDestinations(dest);
			if(destinationsOpt.isPresent()) {
			
			List<FlightEntity> destinationsEntity = destinationsOpt.get();
			
			  List<FlightDTO> destinationsDto =(List<FlightDTO>)destinationsEntity.stream().map(p->{
				  
				  FlightDTO dto = mapper.map(p, FlightDTO.class);
				  return dto;
				  
			  }).collect(Collectors.toList()) ;
				
			  return ResponseEntity.status(HttpStatus.ACCEPTED).body( destinationsDto);
			
		}
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
	
	
	
	public List<FlightDTO> getFlights(String source, String destination, Date journeyDate) {

		List<FlightEntity> flights = flightRepository.findFlightDetails(source, destination, journeyDate);

		List<FlightDTO> availableFlights = new ArrayList<FlightDTO>();
		for (FlightEntity f : flights) {
			FlightDTO flight = new FlightDTO();
			flight.setFlightId(f.getFlightId());
			flight.setSource(f.getSource());
			flight.setDestination(f.getDestination());
			flight.setJourneyDate(f.getFlightAvailableDate());
			flight.setDepartureTime(f.getDepartureTime());
			flight.setArrivalTime(f.getArrivalTime());
			flight.setSeatCount(f.getSeatCount().toString());
			flight.setAirlines(f.getAirlines());
			flight.setFare(Double.toString(f.getFare()));
			availableFlights.add(flight);
		}

		return availableFlights;

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
