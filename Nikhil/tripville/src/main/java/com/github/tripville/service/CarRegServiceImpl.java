package com.github.tripville.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.tripville.model.MemberCar;
import com.github.tripville.repository.CarRepository;

@Service("carRegServiceImpl")
public class CarRegServiceImpl implements CarRegService{
	
	@Autowired
	private CarRepository carRepository;
	
	@Transactional
	public MemberCar save(MemberCar car) {
		System.out.println("inside save 2 : "+car.getRegno());
		return carRepository.save(car);
	}

}
