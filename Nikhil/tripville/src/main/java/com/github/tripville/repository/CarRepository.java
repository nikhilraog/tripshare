package com.github.tripville.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.tripville.model.MemberCar;


@Repository("carRepository")
public interface CarRepository extends JpaRepository<MemberCar, Long>{

}
