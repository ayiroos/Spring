package com.sooriya.controller;



import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping (value = "/students", method = RequestMethod.GET)
	public ArrayList<Student> getListOfStudents() {
		
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Student s1= new Student();		
		Student s2= new Student();
		Student s3= new Student();
		
		s1.setStudentName("Chiranjeevi");
		s2.setStudentName("Pawan Kalyan");
		s3.setStudentName("Ram Charan");
		
		
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		
		return listOfStudents;
	}
	
	@InitBinder
	public void initBinder (WebDataBinder binder) {
		
		//binder.setDisallowedFields(new String [] {"studentMobile"});
		SimpleDateFormat format = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping (value = "/submitForm", method = RequestMethod.GET)
	public ModelAndView submitFormDetails () throws Exception {
		
		String exception = "Exception";
		
		if (exception.equalsIgnoreCase("Exception")) {
			
			throw new Exception("Unknown Exception");
			
		}
		
		ModelAndView modelAndView = new ModelAndView ("SubmitForm");
		return modelAndView;
	}
	
	
	@RequestMapping (value = "/getDetails", method = RequestMethod.POST)
	public ModelAndView getFormDetails (@Valid @ModelAttribute ("student1") Student student, BindingResult result) {
		
		if (result.hasErrors()) {
			
			ModelAndView modelAndView = new ModelAndView ("SubmitForm");
			return modelAndView;
		}
		
		
		ModelAndView modelAndView = new ModelAndView("GetForm");
				
	//	modelAndView.addObject("formData", "Hey "+ student1.getStudentName() + "You are interested in "+ student1.getStudentHobby());
		
		return modelAndView;
	}
	
	@ModelAttribute
	public void commonObjects (Model model) {
					
		model.addAttribute("headerMessage","Sooriya's Farm");
		
	}
	
	

}
