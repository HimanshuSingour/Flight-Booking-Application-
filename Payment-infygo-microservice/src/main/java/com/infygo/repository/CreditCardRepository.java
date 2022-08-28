package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infygo.entity.CreditCardDetails;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardDetails, String>{

}
