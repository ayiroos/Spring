package com.sooriya.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String listOfValidHobbies;
	
	@Override
	public void initialize(IsValidHobby constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
		listOfValidHobbies=constraintAnnotation.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {

		if (studentHobby == null) {
			
			return false;
			
		}
		
		if (studentHobby.matches(listOfValidHobbies)) {
			
			return true;
			
		}	
		
		else {
			
			return false;
		}
		
	}

}
