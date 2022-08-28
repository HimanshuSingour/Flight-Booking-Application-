package com.infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.CreditCardDTO;
import com.infygo.entity.CreditCardDetails;
import com.infygo.repository.CreditCardRepository;
import com.infygo.service.PaymentService;

@RestController
@RequestMapping("/infygo")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
//	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	@PostMapping("/payment")
	public ResponseEntity<Boolean> validateCreditCard(@RequestBody CreditCardDTO creditCardDTO) {
		
		return paymentService.validateCard(creditCardDTO);
	}
}
