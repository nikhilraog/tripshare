package com.github.tripville.repository;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.TripReq;

@Repository("tripreqRepository")
public interface TripReqRepository  extends CrudRepository<TripReq, Long>{

	@Query("select tr from TripReq tr where tr.copassid = :loggedInUserId")
	ArrayList<TripReq> getTripsforPassenger(@Param("loggedInUserId") String loggedInUserId);
}


