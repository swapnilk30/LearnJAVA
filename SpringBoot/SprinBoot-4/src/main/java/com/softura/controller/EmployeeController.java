package com.softura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softura.entity.Employee;
import com.softura.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path="/save",consumes = {MediaType.APPLICATION_XML_VALUE})
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}
	@GetMapping("/allEmp")
	public List<Employee> getAllEmp(){
		List<Employee> allEmployee = employeeService.getAllEmployee();
		return allEmployee;
	}
	
	@GetMapping(path="/{id}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmpById(@PathVariable int id) {
		Employee employeeById = employeeService.getEmployeeById(id);
		return employeeById;
	}

}
