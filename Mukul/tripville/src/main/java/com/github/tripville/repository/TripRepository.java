package com.github.tripville.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.Member;
import com.github.tripville.model.Trip;

@Repository("tripRepository")
public interface TripRepository extends CrudRepository<Trip, Long> {//extends JpaRepository<Member, Long> {
	
	@Query("select t from Trip t where t.tripid = :tripId")
	Trip findByTripId(@Param("tripId") int tripId);
	
	@Query("select m from Member m where m.userName = :userName")
	Member getUserInfo(@Param("userName") String userName);
	
	
	@Query("select t from Trip t where t.userid=:loggedInUserId")
	ArrayList<Trip> getTripsForDriver(@Param("loggedInUserId") String loggedInUserId);	
}


