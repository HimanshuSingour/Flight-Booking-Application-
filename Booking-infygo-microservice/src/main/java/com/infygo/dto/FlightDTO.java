package com.infygo.dto;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FlightDTO {
	
	@NotEmpty(message = "Please enter the origin")
	@NotNull(message = "Soource is mandatory")
	private String source;

	@NotEmpty(message = "Please enter the destination")
	@NotNull(message = "Destination is mandatory")
	private String destination;
	@NotEmpty(message = "Please enter the journey date")
	@NotNull(message = "Journey date is mandatory")
	private Date flightAvailableDate;

	private String fare;
	private String flightId;

	private String seatCount;
	private String departureTime;
	private String arrivalTime;
	private String airlines;

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getFlightAvailableDate() {
		return flightAvailableDate;
	}

	public void setFlightAvailableDate(Date calendar) {
		this.flightAvailableDate = calendar;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	


}

