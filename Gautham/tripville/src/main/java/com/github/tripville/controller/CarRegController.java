package com.github.tripville.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.tripville.model.Member;
import com.github.tripville.model.MemberCar;
import com.github.tripville.service.CarRegService;

@Controller
@SessionAttributes("carRegister")
public class CarRegController {

	@Autowired
	private CarRegService carRegService;
	
	@RequestMapping(value="/carregistration", method=RequestMethod.GET)
	public String carregistration(Model model) {			
		
		MemberCar car = new MemberCar();		
		Member student = new Member();
		System.out.println("username"+student.getUserName());
		model.addAttribute("carRegister", car);
		model.addAttribute("sample", "dummy");
		return "carregistration";
	}
	
	@RequestMapping(value="/carregistration", method=RequestMethod.POST)
	public String carregistration(@Valid @ModelAttribute("carRegister") MemberCar car,BindingResult result, Model model) {		
//		System.out.println("inside member controller1: "+student.getUserName());
		System.out.println("inside member controller1: "+car.getRegno());
		if(result.hasErrors()) {
			return "carregistration";
//		} else if(studentService.findByUserName(car.getRegno())) {
//			model.addAttribute("message", "User Name exists. Try another user name");
//			return "signup";
		} else {
			carRegService.save(car);
			model.addAttribute("message", "Saved member details");
			return "redirect:login.html";
		}
	}
}
