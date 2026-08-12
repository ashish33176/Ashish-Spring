package com.learning.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "ad2")
public class Address2  implements AddInterface {

	private String city = "Lucknow", state = "UP";

	
	
}	
	

	
	
