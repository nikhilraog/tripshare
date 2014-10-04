package edu.utdallas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
	 
@Controller
public class TripController {
      
	private Trip trip = new Trip();
	
    /**
     * Render createtrip page via freemarker template.
     * 
     * @param model 
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/createtrip", method = RequestMethod.GET)
    public String createtrip(@ModelAttribute("model") ModelMap model) {
        return "createtrip";
    }
    
    /**
     * Render searchtrip page via freemarker template.
     * 
     * @param model *
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/searchtrip", method = RequestMethod.GET)
    public String searchtrip(@ModelAttribute("model") ModelMap model) {
        return "searchtrip";
    }
    /**
     * Redirect user to Create new Trip
     * same into FTL via redirect 
     * 
     * @param 
     * @return Redirect to /createtrip page
     */
    @RequestMapping(value = "/createTripAction", method = RequestMethod.POST)
    public String createTripAction() 
    {
        return "redirect:createtrip.html";
    }
    
    
    /**
     * Redirect user to Search Trip
     * same into FTL via redirect 
     * 
     * @param 
     * @return Redirect to /searchtrip page
     */
    @RequestMapping(value = "/searchTripAction", method = RequestMethod.POST)
    public String searchTripAction()
    {
    	return "redirect:searchtrip.html";
    }

    /**
     * Create new trip
     * same into FTL via redirect 
     * 
     * @param 
     * @return Redirect to /createtrip page
     */
    @RequestMapping(value = "/createNewTrip", method = RequestMethod.POST)
    public String createNewTrip(@ModelAttribute("trip") Trip trip) 
    {
        
    	System.out.println("Value"  + trip.getSource() +':'+ trip.getDestination() +':'+ 
    			trip.getStartDate() +':'+ trip.getStartTime() +':'+ trip.getAvailableSeats() +':'+
    			trip.getRent() + "*****" );
        
    	return "redirect:createtrip.html";
    }
    
    /**
     * Create new trip
     * same into FTL via redirect 
     * 
     * @param 
     * @return Redirect to /createtrip page
     */
    @RequestMapping(value = "/performSearchTrip", method = RequestMethod.POST)
    public String performSearchTrip(@ModelAttribute("trip") Trip trip) 
    {
        
    	System.out.println("Value"  + trip.getSource() +':'+ trip.getDestination() +':'+ 
    			trip.getStartDate() +':'+ trip.getStartTime() +':'+ trip.getAvailableSeats() +':'+
    			trip.getRent() + "*****" );
        
    	return "redirect:searchtrip.html";
    }
    
	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}
}
