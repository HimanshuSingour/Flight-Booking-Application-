package com.infygo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infygo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	
	
	@Query("from User e where e.user_id=:x and e.password=:y")
	public Optional<User> findByIdAndPassword(@Param("x")String id,@Param("y")String password);

	

	
	

	
}
