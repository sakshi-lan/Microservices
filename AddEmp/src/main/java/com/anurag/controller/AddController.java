package com.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anurag.bean.Employee;
import com.anurag.service.EmployeeServiceI;

@RestController
public class AddController {
	
	@Autowired
	private EmployeeServiceI service;
	
	@Autowired
	RestTemplate rest;
	
	@PostMapping("/add/Employee")
	public String addEmployee(@RequestBody Employee emp) {
		Employee e = service.addEmployee(emp);
		if(e != null) {
			return "Employee was added successfully!!";
		}
		else {
			return "Sorry, employee was not added";
		}
	}
}