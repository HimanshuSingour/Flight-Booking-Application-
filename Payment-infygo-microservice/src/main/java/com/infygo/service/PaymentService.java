package com.infygo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infygo.dto.CreditCardDTO;
import com.infygo.entity.CreditCardDetails;
import com.infygo.repository.CreditCardRepository;


@Service
public class PaymentService {
	@Autowired
	private CreditCardRepository creditCardRepository;
	@Autowired
	private ModelMapper mapper;

	public ResponseEntity<Boolean> validateCard(CreditCardDTO creditCardDTO) {
		
		CreditCardDetails cardDetails = (mapper.map(creditCardDTO, CreditCardDetails.class));
		
		boolean result = false;
		try {
		Optional<CreditCardDetails >creditCardInfoOpt = creditCardRepository.findById(creditCardDTO.getCardNumber());
		if(creditCardInfoOpt.isPresent())
		{
			CreditCardDetails creditCardInfo = creditCardInfoOpt.get();
			if (cardDetails != null 
					&& creditCardInfo.getApin().equals(cardDetails.getApin())
					&& creditCardInfo.getCvv().equals(cardDetails.getCvv())
					&& creditCardInfo.getCardHolderName().equals(cardDetails.getCardHolderName())) {
				
				result = true;
				
			}
		}
	
			
			
		}
		catch (Exception a) {
			
			return new ResponseEntity<Boolean>(result, HttpStatus.OK);
		}
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);

	}
}
