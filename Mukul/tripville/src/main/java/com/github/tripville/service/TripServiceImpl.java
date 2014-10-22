package com.github.tripville.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.tripville.model.Member;
import com.github.tripville.model.Trip;
import com.github.tripville.repository.TripRepository;

@Service("tripService")
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;
	
	@Transactional
	public Trip save(Trip tripDetails) {
		return tripRepository.save(tripDetails);
	}
	
}

