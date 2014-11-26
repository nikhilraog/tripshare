package com.github.tripville.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.tripville.model.Trip;
import com.github.tripville.model.TripReq;
import com.github.tripville.repository.TripRepository;
import com.github.tripville.repository.TripReqRepository;

@Service("tripreqService")
public class TripReqServiceImpl implements TripReqService {

/*	public TripReq t_req(TripReq t_req) {
		
		return null;
	}
	
*/
	@Autowired
	private TripReqRepository tripreqRepository;

	public ArrayList<TripReq> getTripsforPassenger(String loggedInUserId) {
		
		//return tripRepository.getTripsForDriver(loggedInUserId);
		
		//return TripReq.getTripsforPassenger(loggedInUserId);
		return tripreqRepository.getTripsforPassenger(loggedInUserId);
		
	}

}
