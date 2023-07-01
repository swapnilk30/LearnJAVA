package com.softura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	@Override
	public List<Employee> getAllEmployeeByPage(int page, int size) {
		
		PageRequest pageRequest = PageRequest.of(page, size);
		Page<Employee> pageResponse = employeeRepository.findAll(pageRequest);
		List<Employee> list = pageResponse.getContent();
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeBySorting() {
		List<Employee> findAll = employeeRepository.findAll(Sort.by("salary").descending());
		return findAll;
	}

}
