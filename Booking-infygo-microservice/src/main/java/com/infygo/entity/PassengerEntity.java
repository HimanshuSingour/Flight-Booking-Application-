package com.infygo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.infygo.dto.PassengerDTO;


@Entity
public class PassengerEntity {
	
	@Id
	private int passenger_id;
	private String passenger_age;
	private String passenger_gender;
	private String passenger_name;
	private int passenger_pnr;
	public PassengerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerEntity(int passenger_id, String passenger_age, String passenger_gender, String passenger_name,
			int passenger_pnr) {
		super();
		this.passenger_id = passenger_id;
		this.passenger_age = passenger_age;
		this.passenger_gender = passenger_gender;
		this.passenger_name = passenger_name;
		this.passenger_pnr = passenger_pnr;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(String passenger_age) {
		this.passenger_age = passenger_age;
	}
	public String getPassenger_gender() {
		return passenger_gender;
	}
	public void setPassenger_gender(String passenger_gender) {
		this.passenger_gender = passenger_gender;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public int getPassenger_pnr() {
		return passenger_pnr;
	}
	public void setPassenger_pnr(int passenger_pnr) {
		this.passenger_pnr = passenger_pnr;
	}
	@Override
	public String toString() {
		return "PassengerEntity [passenger_id=" + passenger_id + ", passenger_age=" + passenger_age
				+ ", passenger_gender=" + passenger_gender + ", passenger_name=" + passenger_name + ", passenger_pnr="
				+ passenger_pnr + "]";
	}
	
	
	
		
		
	}
	
	


