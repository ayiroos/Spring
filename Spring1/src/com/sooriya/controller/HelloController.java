package com.sooriya.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


	@RequestMapping (value = "/submitForm", method = RequestMethod.GET)
	public ModelAndView submitFormDetails () {
		
		ModelAndView modelAndView = new ModelAndView ("SubmitForm");
		return modelAndView;
	}
	
	@RequestMapping (value = "/getDetails", method = RequestMethod.POST)
	public ModelAndView getFormDetails (@RequestParam Map<String, String> vars) {
		
		ModelAndView modelAndView = new ModelAndView("GetForm");
		String hobby = vars.get("studentHobby");
		String name = vars.get("studentName");
		
		modelAndView.addObject("formData", "Hey "+ name + "You are interested in "+ hobby);
		return modelAndView;
	}

}
