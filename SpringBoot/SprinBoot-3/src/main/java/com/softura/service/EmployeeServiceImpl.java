package com.softura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softura.entity.Employee;
import com.softura.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Iterable<Employee> findAll = employeeRepository.findAll();
		return (List<Employee>) findAll;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> response = employeeRepository.findById(id);
		
		return response.isPresent()? response.get():null;
	}

	@Override
	public int updateEmployee(Employee employee) {
		Employee response = employeeRepository.save(employee);
		return response.getId();
	}

	@Override
	public String deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}

}
