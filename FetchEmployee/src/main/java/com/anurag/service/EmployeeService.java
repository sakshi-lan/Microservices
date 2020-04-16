package com.anurag.service;
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
	public Employee fetchEmployee(int id) {
		return dao.fetchEmployee(id);
	}
}
