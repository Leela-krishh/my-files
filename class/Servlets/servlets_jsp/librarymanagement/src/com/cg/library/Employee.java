package com.cg.library;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private double salary;
public Employee() {
	// TODO Auto-generated constructor stub
}
	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
