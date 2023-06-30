package com.softura.service;

import java.util.List;

import com.softura.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);//add employee
	List<Employee> getAllEmployee();// get all list of employee
	Employee getEmployeeById(int id);//get Employee by id
	// update employee
	//delete employee

}
