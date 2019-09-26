package com.sooriya.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


	@RequestMapping("/welcome/{country}/{name}")
	protected ModelAndView myApp(@PathVariable Map<String, String> vars) {
		
		String country = vars.get("country");
		String name = vars.get("name");
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("welcome", "Hey "+ name + "You are from "+ country);
		return modelAndView;
	}

}
