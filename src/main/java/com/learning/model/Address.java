package com.learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Address {
	
	
	private String city,state;
	
	
	public Address(String city, String state) {
		super();	
		this.city = city;
		this.state = state;
		System.out.println("Address.Address(2)");
	}


	public Address() {
		super();
		System.out.println("Address.Address()");
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		System.out.println("Address.setCity()");
		this.city = city;
	}


	public String getState() {
		System.out.println("Address.setState()");
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	

}
