package com.github.tripville.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.tripville.model.Member;
import com.github.tripville.model.MemberCar;
import com.github.tripville.model.MemberLogin;
import com.github.tripville.service.CarRegService;
import com.github.tripville.service.StudentService;

@Controller
@SessionAttributes("student")
public class MemberController {
	
	@Autowired
	private StudentService studentService;
	

		
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		
		Member student = new Member();	
//		MemberCar car = new MemberCar();
		model.addAttribute("student", student);		
//		model.addAttribute("car", car);	
//		System.out.println("inside member controller2: " +car.getUserName());
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("student") Member student,BindingResult result, Model model) {		
//		System.out.println("inside member controller1: "+student.getUserName());
//		System.out.println("inside member controller1: "+car.getRegno());
		if(result.hasErrors()) {
			return "signup";
		} else if(studentService.findByUserName(student.getUserName())) {
			model.addAttribute("message", "User Name exists. Try another user name");
			return "signup";
		} else {
			studentService.save(student);
			model.addAttribute("message", "Saved member details");
			model.addAttribute("userName",student.getUserName());
			return "redirect:carregistration.html";
		}
	}
	
//	@RequestMapping(value="/signup", method=RequestMethod.POST)
//	public void signup(@Valid @ModelAttribute("student") MemberCar car,BindingResult result, Model model) {		
//		System.out.println("inside member controller1: "+car.getRegno());
//	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {			
		MemberLogin studentLogin = new MemberLogin();		
		model.addAttribute("studentLogin", studentLogin);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("studentLogin") MemberLogin studentLogin, BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		} else {
			boolean found = studentService.findByLogin(studentLogin.getUserName(), studentLogin.getPassword());
			if (found) {				
				return "success";
			} else {				
				return "failure";
			}
		}
		
	}
	
	
}
