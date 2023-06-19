package com.softura.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(100,"ABC",30,"Female","HR"));
		emp.add(new Employee(100,"PQR",25,"Male","IT"));
		emp.add(new Employee(100,"LMN",30,"Male","HR"));
		emp.add(new Employee(100,"XYZ",28,"Female","IT"));
		
		//emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);	

		//Map<String, Long> employeeCount = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		Map<String, Double> avgAgeEmployee = emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAgeEmployee);
	}

}
