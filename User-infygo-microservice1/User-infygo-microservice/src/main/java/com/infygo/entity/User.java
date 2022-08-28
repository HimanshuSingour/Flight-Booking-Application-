package com.infygo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	@NotNull(message = "UserId cannot be left empty!")
	private String user_id;
	@NotNull(message = "City cannot be left empty!")
	private String city;
	@Email(message = "Email is not valid")
	@NotNull(message = "Email cannot be left empty!")
	private String email;
	@NotNull(message = "Name cannot be left empty!")
	private String name;
	@NotNull(message = "Password cannot be left empty!")
	private String password;
	@NotNull(message = "Phone cannot be left empty!")
	private String phone;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(@NotNull(message = "UserId cannot be left empty!") String user_id,
			@NotNull(message = "City cannot be left empty!") String city,
			@Email(message = "Email is not valid") @NotNull(message = "Email cannot be left empty!") String email,
			@NotNull(message = "Name cannot be left empty!") String name,
			@NotNull(message = "Password cannot be left empty!") String password,
			@NotNull(message = "Phone cannot be left empty!") String phone) {
		super();
		this.user_id = user_id;
		this.city = city;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
