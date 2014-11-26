package com.github.tripville.service;
import java.util.ArrayList;

import com.github.tripville.model.Trip;
import com.github.tripville.model.TripReq;


public interface TripReqService {

	
	
	ArrayList<TripReq> getTripsforPassenger(String loggedInUserId);//passenger id as userid
	
}
