package com.infygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infygo.entity.PassengerEntity;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerEntity, Integer> {

}
