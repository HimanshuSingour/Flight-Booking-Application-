package com.infygo.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.infygo.entity.FlightEntity;


@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, String>{
	
	@Query("from FlightEntity f where f.source=:x ")
	Optional<List<FlightEntity>> findFlightSources(@Param("x")String src);
	
	@Query("from FlightEntity f where f.destination=:x ")
	Optional<List<FlightEntity>> fingFlightDestinations(@Param("x")String dest);
	
	@Query("select f from FlightEntity f where f.source=:source and f.destination=:dest and f.flightAvailableDate=:jdate")
	List<FlightEntity> findFlightDetails(@Param("source") String source, @Param("dest") String destination,
			@Param("jdate") Date date);
}
