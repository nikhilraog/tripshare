package com.github.tripville.service;

import com.github.tripville.model.Member;
import com.github.tripville.model.MemberCar;

public interface StudentService {
	Member save(Member student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
