package com.sooriya.controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.core.annotation.Order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties({"studentSkillSet"})
@JsonPropertyOrder ({"student_name", "studentHobby", "studentMobile", "studentDOB", "studentSkillSet"})
public class Student {
	

	@Pattern(regexp = "[^0-9]*")
	@JsonProperty("student_name")
	private String studentName;
	
	@Size(min = 2, max = 10)
	@IsValidHobby(listOfValidHobbies = "Acting|Farming|Whistling|Husking")
	private String studentHobby;
		
	@Max(value = 9999)
	private Long studentMobile;
	@Past
	private Date studentDOB;
	Collection<String> studentSkillSet = new ArrayList<String>(); 
	private Address studentAddress;
	
	
	
	
//	public Student(String studentName, String studentHobby, Long studentMobile, Date studentDOB,
//			ArrayList<String> studentSkillSet) {
//		
//		this.studentName = studentName;
//		this.studentHobby = studentHobby;
//		this.studentMobile = studentMobile;
//		this.studentDOB = studentDOB;
//		this.studentSkillSet = studentSkillSet;
//	}
//	
//	public Student () {
//				
//	}
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkillSet() {
		return (ArrayList<String>) studentSkillSet;
	}
	public void setStudentSkillSet(List<String> studentSkillSet) {
		this.studentSkillSet = studentSkillSet;
	}
		
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	

}
