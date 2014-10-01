package com.weather.app;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

import com.myweather.clas.Weather;

@Controller
public class WeatherAppController {
		
	@RequestMapping(value = "/weatherCheck",method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody Weather gw(@RequestParam (value="location") String location, Model model){
		//response.setHeader("Content-Type", "application/json; charset=UTF-8");
		
		//Core logic towards location branching goes here
		String currentWeather = "";
		//Weather bangalore = null;
		
		if(location.equalsIgnoreCase("bangalore")){
			//bangalore = new Weather(60,20,false);
			//return bangalore;
		    currentWeather= "Fine";
		    //return "index";
		    return new ModelAndView("result", weather, currentWeather);
		
		 }
		 //return bangalore;
	}

}
