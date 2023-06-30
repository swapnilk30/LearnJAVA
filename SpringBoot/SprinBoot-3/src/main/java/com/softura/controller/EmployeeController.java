package com.softura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softura.entity.Employee;
import com.softura.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	// add Employee
	@PostMapping("/save")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}
	// get all list of employees
	@GetMapping("/allEmp")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
	}

	// get Employee by id using path variable
	@GetMapping("/{id}")
	public Employee getEmpById(@PathVariable int id) {
		Employee employeeById = employeeService.getEmployeeById(id);
		
		return employeeById;
	}
	
	//get employee by id using request param
	@GetMapping("/request")
	public Employee getById(@RequestParam("empcode") int id) {
		Employee employeeById = employeeService.getEmployeeById(id);
		return employeeById;
		
	}
	
	//update employee
	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee employee) {
		int id = employeeService.updateEmployee(employee);
		return String.format("Employee is updated for the id :: %d",id);
	}
	// delete Employee
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		String response = employeeService.deleteEmployeeById(id);
		return response;
	}
	
}
