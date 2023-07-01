package com.softura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softura.entity.Employee;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{//extends CrudRepository<Employee,Integer> {

	public List<Employee> findByCity(String city);
	
	public List<Employee> findByName(String name);
	
	public Employee findByNameAndCity(String name,String city);
	
	
}
