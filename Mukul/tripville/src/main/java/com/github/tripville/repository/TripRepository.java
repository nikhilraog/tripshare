package com.github.tripville.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.Member;
import com.github.tripville.model.Trip;

@Repository("tripRepository")
public interface TripRepository extends CrudRepository<Trip, Long> {//extends JpaRepository<Member, Long> {
	
	/*@Query("select * from trip t where t.tripId = :tripId")
	Trip findByTripId(@Param("tripId") String tripId);*/
	
}


