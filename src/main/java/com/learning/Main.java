package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Address;
import com.learning.model.Employee;

public class Main {

	public static void main(String[] args) {
		
	ApplicationContext ioc = new AnnotationConfigApplicationContext("com.learning");
	
	System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");	
		
   Employee bean = ioc.getBean("employee",Employee.class);
   System.out.println(bean);
   
   
   
   System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");	
   
  Address address =  ioc.getBean(Address.class);
  System.out.println(address);
   
	}

	}
   
   
   
    
    
    
    
	
