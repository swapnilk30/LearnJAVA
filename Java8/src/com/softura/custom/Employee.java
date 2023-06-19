package com.softura.custom;

public class Employee {
	private int id;
	private String namee;
	private int age;
	private String gender;
	private String department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String namee, int age, String gender, String department) {
		super();
		this.id = id;
		this.namee = namee;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", namee=" + namee + ", age=" + age + ", gender=" + gender + ", department="
				+ department + "]";
	}
	
}
