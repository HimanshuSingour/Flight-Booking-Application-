package com.infygo.dto;

public class UserDTO {

	private String user_id;
	private String city;
	private String email;
	private String name;
	private String password;
	private String phone;

	public UserDTO(String user_id, String city, String email, String name, String password, String phone) {
		super();
		this.user_id = user_id;
		this.city = city;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

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

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
