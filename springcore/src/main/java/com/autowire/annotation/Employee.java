package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("Setting");
		this.address = address;
	}

	public Employee() {
		super();
	}

	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("using construter");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
