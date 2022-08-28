package com.infygo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.dto.FlightDTO;
import com.infygo.dto.PassengerDTO;
import com.infygo.dto.TicketDTO;
import com.infygo.entity.TicketEntity;
import com.infygo.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository ticketRepo;
	

	
	public TicketDTO createTicket(String fId,String userId,int numberOfSeats,FlightDTO flightDto) 
	{
		
//		SimpleDateFormat inputformate = new SimpleDateFormat("yyyy/MM/dd");
//		String dt  ="2022/08/28";
//		Date date=null;
//		date = inputformate.parse(dt);
		
		TicketEntity entity = new TicketEntity();
		entity.setBooking_date(java.sql.Date.valueOf(LocalDate.now()));
		entity.setDeparture_date(flightDto.getFlightAvailableDate());
		entity.setDeparture_time(flightDto.getDepartureTime());
		entity.setFlight_id(fId);
		entity.setNo_of_seats(numberOfSeats);
		entity.setUser_id(userId);
		entity.setPnr((int) (Math.random() * 1858955));
		TicketDTO dto = TicketEntity.prepareToDto(entity);
		ticketRepo.save(entity);
		
		
		return dto;
		
		
	}
	
}
