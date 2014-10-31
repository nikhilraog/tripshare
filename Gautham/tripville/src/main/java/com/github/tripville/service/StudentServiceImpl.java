package com.github.tripville.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.tripville.model.Member;
import com.github.tripville.model.MemberCar;
import com.github.tripville.repository.CarRepository;
import com.github.tripville.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	
	@Transactional
	public Member save(Member student) {
		return studentRepository.save(student);
	}
	
	public boolean findByLogin(String userName, String password) {	
		Member stud = studentRepository.findByUserName(userName);
		
		if(stud != null && stud.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		Member stud = studentRepository.findByUserName(userName);
		
		if(stud != null) {
			return true;
		}
		
		return false;
	}

}
