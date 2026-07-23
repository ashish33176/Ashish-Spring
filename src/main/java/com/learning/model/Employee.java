package com.learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data



public class Employee {
	
	private int id;
	private String name,gender;
	private int salary;
	
	public Employee() {
		
		System.out.println("Employee.Employee()");
	}
	
	
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.Employee()");
	}



	public Employee(int id, String name, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		System.out.println("Employee.Employee(4)");
		
	
	}
	
	

}
