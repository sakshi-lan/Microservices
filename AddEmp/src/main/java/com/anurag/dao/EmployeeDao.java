package com.anurag.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.anurag.bean.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoI{

	@PersistenceContext
	private EntityManager em;
	@Override
	public Employee addEmployee(Employee emp) {
		em.merge(emp);
		return emp;
	}
	
}