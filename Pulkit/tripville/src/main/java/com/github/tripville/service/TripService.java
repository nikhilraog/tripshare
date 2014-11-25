package com.github.tripville.service;

import java.util.List;

import com.github.tripville.model.Trip;

public interface TripService {
	Trip save(Trip trip);
	String getUserId(String userName);
	List<Trip> searchTrip(String startpt);
}
