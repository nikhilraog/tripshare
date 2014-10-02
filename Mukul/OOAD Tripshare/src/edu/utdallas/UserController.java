package edu.utdallas;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class UserController {
    /**
     * Static list of users to simulate Database
     */
    private static List<User> userList = new ArrayList<User>();
 
    //Initialize the list with some data for index screen
    static {
     
    }
 
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model 
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(@ModelAttribute("model") ModelMap model) {
 
        model.addAttribute("userList", userList);
 
        return "home";
    }
    
    
    /**
     * Saves the static list of users in model and renders it 
     * via freemarker template.
     * 
     * @param model 
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(@ModelAttribute("model") ModelMap model) {
 
        model.addAttribute("userList", userList);
 
        return "registration";
    }
    /**
     * Login user 
     * same into FTL via redirect 
     * 
     * @param user
     * @return Redirect to /home page to display user list
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user) {
 
        if (null != user && null != user.getUsername()
                && null != user.getPassword() && !user.getUsername().isEmpty()
                && !user.getPassword().isEmpty()) {
 
            synchronized (userList) {
                userList.add(user);
            }
 
        }
 
        return "redirect:home.html";
    }
    /**
     * New Trip 
     * same into FTL via redirect 
     * 
     * @param user
     * @return Redirect to /home page to display user list
     */
    @RequestMapping(value = "/addtrip", method = RequestMethod.POST)
    public String addtrip(@ModelAttribute("user") User user) {
 
        if (null != user && null != user.getUsername()
                && null != user.getPassword() && !user.getUsername().isEmpty()
                && !user.getPassword().isEmpty()) {
 
            synchronized (userList) {
                userList.add(user);
            }
 
        }
 
        return "redirect:home.html";
    }
    /**
     * Login user 
     * same into FTL via redirect 
     * 
     * @param user
     * @return Redirect to /home page to display user list
     */
    @RequestMapping(value = "/searchtrip", method = RequestMethod.POST)
    public String searchtrip(@ModelAttribute("user") User user) {
 
        if (null != user && null != user.getUsername()
                && null != user.getPassword() && !user.getUsername().isEmpty()
                && !user.getPassword().isEmpty()) {
 
            synchronized (userList) {
                userList.add(user);
            }
 
        }
 
        return "redirect:home.html";
    }
 
}