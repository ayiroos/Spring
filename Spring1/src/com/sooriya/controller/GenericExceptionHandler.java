package com.sooriya.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GenericExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		
		System.out.println("Null Pointer Exception" + e);
		return "NullPointerException";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		
		System.out.println("IO Exception" + e);
		return "IOException";
	}
	
	@ResponseStatus (value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler (value = Exception.class)
	public String handleGenericException (Exception e) {
		
		System.out.println("Unknown Exception" + e);
		return "Exception";
	}

}
