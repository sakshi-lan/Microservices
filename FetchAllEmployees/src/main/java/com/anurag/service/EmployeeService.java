package com.anurag.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.bean.Employee;
import com.anurag.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{
	
	@Autowired
	private EmployeeDaoI dao;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = dao.getAllEmployees();
		return list;
	}
}
