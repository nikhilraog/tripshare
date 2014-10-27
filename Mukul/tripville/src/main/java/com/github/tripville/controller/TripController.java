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

import com.github.tripville.model.Trip;
import com.github.tripville.service.TripService;

	@Controller
	@SessionAttributes("trip")
	public class TripController {
		
		@Autowired
		private TripService tripService;
			
		@RequestMapping(value="/addtrip", method=RequestMethod.GET)
		public String login(Model model) {			
			Trip tripDetails = new Trip();
			model.addAttribute("trip", tripDetails);
			return "addtrip";
		}
		
		@RequestMapping(value="/addtrip", method=RequestMethod.POST)
		public String addtrip(@Valid @ModelAttribute("trip") Trip tripDetails, BindingResult result, Model model) {
			if (result.hasErrors()) {
				System.out.println(result.getAllErrors());
				return "addtrip";
			} else {
				tripService.save(tripDetails);
				model.addAttribute("message", "Created new trip");
				return "addtrip";
				/*boolean found = true;// = TripService.findByLogin(studentLogin.getUserName(), studentLogin.getPassword());
				if (found) {				
					return "success";
				} else {				
					return "failure";
				}*/
			}
			
		}
	}

