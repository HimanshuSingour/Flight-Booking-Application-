package com.infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.UserDTO;
import com.infygo.service.UserService;

@RestController
@RequestMapping("/infyGo")
public class UserController {

	@Autowired
	private UserService service;

//	@PostMapping("/register")
//	public ResponseEntity<String> registerUser(@RequestBody UserDTO dto) {
//		return service.registerCustomer(dto);
//	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserDTO dto)
	{
		return service.registerUserService(dto);
	}

	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserDTO dto){
		
		
		return service.loginUser(dto.getUser_id(),dto.getPassword());
		
		
	}
	
	
}
