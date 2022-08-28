package com.infygo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infygo.dto.PassengerDTO;

@Service
public class PassengerService {

	
	public List<PassengerDTO> createPassenger (int pnr,List<PassengerDTO> listPassengerDTO){
		
		for(PassengerDTO dto : listPassengerDTO) {
			
			dto.setPassenger_pnr(pnr);
			
			
		}
		
		return listPassengerDTO;
	}
}
