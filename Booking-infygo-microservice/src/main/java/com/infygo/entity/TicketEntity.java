package com.infygo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.infygo.dto.TicketDTO;

@Entity
public class TicketEntity {

 
	@Id
	private int pnr; 
 
	private Date booking_date ;
	private Date departure_date  ;
	private String departure_time;
	private String flight_id ; 
	private int no_of_seats ;
	private double total_fare;
	private String user_id ;
	public TicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketEntity(int pnr, Date booking_date, Date departure_date, String departure_time, String flight_id,
			int no_of_seats, double total_fare, String user_id) {
		super();
		this.pnr = pnr;
		this.booking_date = booking_date;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.flight_id = flight_id;
		this.no_of_seats = no_of_seats;
		this.total_fare = total_fare;
		this.user_id = user_id;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public Date getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public double getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(double total_fare) {
		this.total_fare = total_fare;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "TicketEntity [pnr=" + pnr + ", booking_date=" + booking_date + ", departure_date=" + departure_date
				+ ", departure_time=" + departure_time + ", flight_id=" + flight_id + ", no_of_seats=" + no_of_seats
				+ ", total_fare=" + total_fare + ", user_id=" + user_id + "]";
	}
	
	public static  TicketDTO prepareToDto(TicketEntity e) {
		
		
		TicketDTO dto = new TicketDTO();
		dto.setBooking_date(e.getBooking_date());
		dto.setDeparture_date(e.getDeparture_date());
		dto.setDeparture_time(e.getDeparture_time());
		dto.setFlight_id(e.getFlight_id());
		dto.setNo_of_seats(e.getNo_of_seats());
		dto.setUser_id(e.getUser_id());
		dto.setPnr(e.getPnr());
		return dto;
	}
	
	
	
	
	
	
	
	
	
}
