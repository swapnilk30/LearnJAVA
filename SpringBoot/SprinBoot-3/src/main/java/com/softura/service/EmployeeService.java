package com.softura.service;

import java.util.List;

import com.softura.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	List<Employee> getAllEmployeeByPage(int page,int size);
	
	List<Employee> getAllEmployeeBySorting();
	
	
	Employee getEmployeeById(int id);
	
	int updateEmployee(Employee employee);
	
	String deleteEmployeeById(int id);
	
	

}
