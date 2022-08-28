package com.infygo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infygo.dto.UserDTO;
import com.infygo.entity.User;
import com.infygo.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepos;

	@Autowired
	private ModelMapper mapper;

//	public ResponseEntity<String> registerCustomer(UserDTO dto)  {
//	
//		userRepos.save(mapper.map(dto, User.class));
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body("You have registered succesfully!");
//	}
	
	public ResponseEntity<String> registerUserService(UserDTO dto)
	{
		userRepos.save(mapper.map(dto, User.class));
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("You have registered successfully");
		
	}
	
	
	public ResponseEntity<String> loginUser(String id,String password){
		
	Optional<User> userOptional = userRepos.findByIdAndPassword(id,password);
	if(userOptional.isPresent()) {
			
		
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Successfully Login!");
	}
	
		else {return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong Credentials!");}
		
		
	}

}
