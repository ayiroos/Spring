package com.sooriya.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("welcome", "Hey yoooo...Successfully done with Spring Basic app");
		return modelAndView;
	}

}
