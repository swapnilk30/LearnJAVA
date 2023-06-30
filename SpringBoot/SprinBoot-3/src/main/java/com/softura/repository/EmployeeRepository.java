package com.softura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softura.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {//extends JpaRepository<Employee,Integer>{

}
