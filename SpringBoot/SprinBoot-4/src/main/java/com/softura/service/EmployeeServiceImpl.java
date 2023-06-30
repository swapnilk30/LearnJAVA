package com.softura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softura.entity.Employee;
import com.softura.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee save = employeeRepository.save(employee);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> findById = employeeRepository.findById(id);
		return findById.isPresent()?findById.get():null;
	}

}
