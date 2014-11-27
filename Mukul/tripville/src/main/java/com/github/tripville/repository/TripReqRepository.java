package com.github.tripville.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.Trip;
import com.github.tripville.model.TripReq;

@Repository("tripReqRepository")
public interface TripReqRepository extends CrudRepository<Trip, Long> {
	
	@Query("select t from TripReq t where t.tripid=:tripId")
	ArrayList<TripReq> getTripRequestsForTrip(@Param("tripId") int tripId);	
}



