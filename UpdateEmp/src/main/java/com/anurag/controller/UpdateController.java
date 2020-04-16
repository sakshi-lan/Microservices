package com.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anurag.bean.Employee;
import com.anurag.service.EmployeeServiceI;

@RestController
public class UpdateController {

	@Autowired
	private EmployeeServiceI service;

	@Autowired
	RestTemplate rest;

	@RequestMapping("/update/Employee")
	public String updateEmployee(@RequestBody Employee emp) {
		Employee e = rest.getForObject("http://localhost:6000/fetch/Employee/"+emp.getEid(),Employee.class);
		if(e !=null) {
			e.setEname(emp.getEname());
			e.setEsal(emp.getEsal());
			service.updateEmployee(e);
			return "Employee was updated successfully";
		}
		else {
			return "Sorry, employee with ID : "+emp.getEid()+" does not exist";
		}
	}
}
