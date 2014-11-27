package com.github.tripville.service;
import java.util.ArrayList;

import com.github.tripville.model.Trip;
import com.github.tripville.model.TripReq;


public interface TripReqService {

	//TripReq t_req(TripReq t_req);
	
	ArrayList<TripReq> getTripsforPassenger(String userName);//passenger id as userid
	
	ArrayList<TripReq> getTripRequestsForTrip(int tripId);
}
