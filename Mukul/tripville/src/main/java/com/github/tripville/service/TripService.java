package com.github.tripville.service;

import java.util.ArrayList;

import com.github.tripville.model.Trip;

public interface TripService {
	Trip save(Trip trip);
	String getUserId(String userName);
	Trip getTripDetails(int tripId);
	ArrayList<Trip> getTripsforDriver(String loggedInUserId);
}
