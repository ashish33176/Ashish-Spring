package com.learning.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Component
public class Employee {
	
	private int id = 1;
	private String name = "Vishal",gender = "male";
	private int salary = 44;
	
	
	@Autowired
	@Qualifier(value = "address1")
	private AddInterface add;  
	
	public Employee() {
		
		System.out.println("Employee.Employee()");
	}
	
	
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}
	
	
	public void setAddress(AddInterface add) {
		this.add = add;
		System.out.println("Employee.setAddress()");
	}



	public Employee(int id, String name, String gender, int salary, AddInterface add) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.add = add;
		System.out.println("Employee.Employee(5)");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}



	public String getGender() {
		return gender;
		
	}



	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		System.out.println("Employee.setSalary()");
		this.salary = salary;
		
	}



	public AddInterface getAddress() {
		return add;
	}






	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", add="
				+ add + "]";
	}


}
	
	
	

