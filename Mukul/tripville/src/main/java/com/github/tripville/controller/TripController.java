package com.github.tripville.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


import com.github.tripville.model.Member;
import com.github.tripville.model.MemberLogin;
import com.github.tripville.model.Trip;
import com.github.tripville.model.TripReq;
import com.github.tripville.service.TripReqService;
import com.github.tripville.service.TripService;

	@Controller
	@SessionAttributes("trip")
	public class TripController {
		
		@Autowired
		private TripService tripService;
		
		@Autowired
		private TripReqService tripReqService;
		
		 @Autowired
		 private MemberLogin studentLogin;
		 
		 
		public ArrayList<Trip> driverTripList;
		public ArrayList<TripReq> tripRequestList;
		public String formattedStartDate;
		
		@RequestMapping(value="/addtrip", method=RequestMethod.GET)
		public String addtrip(Model model, HttpSession session) {			
			try{
				Trip tripDetails = new Trip();
				MemberLogin user = (MemberLogin) session.getAttribute("student");
				String loggedInUserId = tripService.getUserId(user.getUserName()); 
				System.out.println("loggedInUserId" + loggedInUserId);
				tripDetails.setUserId(loggedInUserId);
				model.addAttribute("trip", tripDetails);
				return "addtrip";
			}catch(Exception e){
				return "redirect:index.html";
			}
			
		}
		
		
		@RequestMapping(value="/addtrip", method=RequestMethod.POST)
		public String addtrip(@Valid @ModelAttribute("trip") Trip tripDetails, BindingResult result, Model model, @RequestParam("btnClk") String request) {
			System.out.println("btnClk" + request);
			if (request.equalsIgnoreCase("Submit")) {
				System.out.println("Save" );
				if (result.hasErrors()) {
					System.out.println(result.getAllErrors());
				} else {
					tripService.save(tripDetails);
					tripDetails = new Trip();
					model.addAttribute("trip", tripDetails);
					model.addAttribute("message", "Created new trip.");
				} 

		    } else if (request.equalsIgnoreCase("Reset")) {
		    	System.out.println("reset" );	
		    	tripDetails = new Trip();
				model.addAttribute("trip", tripDetails);
				return "redirect:addtrip.html";
		    } else if (request.equalsIgnoreCase("Cancel")) {
				System.out.println("Cancel" );
				return "redirect:home.html";
			}
			return "addtrip";
			
		}
		
		@RequestMapping(value="/tripdetails", method=RequestMethod.GET)
		public ModelAndView tripdetails(Model model, HttpSession session) {			
			try{
				ModelAndView modelAndView = new ModelAndView("tripdetails", "student", studentLogin);
				modelAndView.setViewName("tripdetails");
				
				Trip tripDetails = new Trip();
				
				tripDetails = tripService.getTripDetails(13);
				formattedStartDate = getFormattedDate(tripDetails.getStartDate());
				
				modelAndView.addObject("formattedStartDate", formattedStartDate);
				
				System.out.println("~~~~~~~~~~~~~~" +  formattedStartDate);
				
				tripRequestList = tripReqService.getTripRequestsForTrip(13);  
				modelAndView.addObject("tripRequestList", tripRequestList);
				
				System.out.println("tripRequestList" + tripRequestList + tripRequestList.size());
				
				MemberLogin user = (MemberLogin) session.getAttribute("student");
				String loggedInUserId = tripService.getUserId(user.getUserName()); 
				System.out.println("loggedInUserId" + loggedInUserId);
				tripDetails.setUserId(loggedInUserId);
				model.addAttribute("trip", tripDetails);
				return modelAndView;
				
			}catch(Exception e){
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("index");
				return modelAndView;
			}
			
		}
		
		@RequestMapping(value="/viewtrip", method=RequestMethod.GET)
		public ModelAndView viewtrip(Model model, HttpSession session) {			
			
			try{
				//ModelAndView modelAndView = new ModelAndView("viewtrip", "student", studentLogin);
				//modelAndView.setViewName("viewtrip");
				
				ModelAndView modelAndView = new ModelAndView("tripdetails", "student", studentLogin);
				modelAndView.setViewName("redirect:/tripdetails.html");
				MemberLogin user = (MemberLogin) session.getAttribute("student");
				return modelAndView;
			}
			catch(Exception e){
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("index");
				return modelAndView;
			}
		}
		
		/*@RequestMapping(value="/viewtrip", method=RequestMethod.GET)
		public ModelAndView viewtrip(Model model, HttpSession session) {			
			
			try{
				
				ModelAndView modelAndView = new ModelAndView("viewtrip", "student", studentLogin);
				modelAndView.setViewName("viewtrip");
				MemberLogin user = (MemberLogin) session.getAttribute("student");
				
				//TripService tripServ;
				String loggedInUserId = tripService.getUserId(user.getUserName()); 
				System.out.println("loggedInUserId" + loggedInUserId);
				
				System.out.println("User +:"+ user.getUserName());
				
				driverTripList = tripService.getTripsforDriver(loggedInUserId);
				modelAndView.addObject("driverTripList", driverTripList);
				System.out.println("~~~~~~~~~~" + driverTripList + driverTripList.size() );
				//String view_trip_query = "select * from driverhistory where userid=loggedInUserId or copassid=loggedInUserId";
				return modelAndView;
				
			}
			catch(Exception e){
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("index");
				return modelAndView;
			}
		}*/

		public String getFormattedDate(Date date){
			return new SimpleDateFormat("MM/dd/yyyy").format(date);
		}
		
}
	
	

