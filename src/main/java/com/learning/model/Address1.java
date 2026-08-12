package com.learning.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
//@Primary
public class Address1 implements AddInterface{

	private String city = "Noida", state = "UP";
	
	
	

	
	
}