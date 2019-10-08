package com.sooriya.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint (validatedBy = HobbyValidator.class)
@Target ( {ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String listOfValidHobbies();
	String message() default "Please provide a valid Hobby;" +
	"Accepted hobbies are : Acting, Whistling, Husking, Farming (Choose anyone)";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
