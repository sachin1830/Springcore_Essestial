package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/autowire/autoconfig.xml");
		
		Employee emp=(Employee) context.getBean("emp",Employee.class);
		
		System.out.println(emp);
	}

}
