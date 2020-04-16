package com.anurag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anurag.bean.Employee;
import com.anurag.service.EmployeeServiceI;

@RestController
public class FetchController {

	@Autowired
	private EmployeeServiceI service;
	@GetMapping("/fetch/Employee/{id}")
	public Employee fetchEmployee(@PathVariable("id") int id) {
		Employee e = service.fetchEmployee(id);
		return e;
	}
}