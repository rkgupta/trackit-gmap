package com.poc.trackit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Controller class that handles navigation.
 * @author RA013GU
 *
 */
@Controller
public class TrackitController {
	
	//private Logger logger = Logger.getLogger(TrackitController.class);
	
	@RequestMapping("/")
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	@RequestMapping("/home.html")
	protected ModelAndView handleHomePage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	
}
