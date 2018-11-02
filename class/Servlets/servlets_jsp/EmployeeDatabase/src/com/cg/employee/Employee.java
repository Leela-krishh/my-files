package com.cg.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
//@Table(name="emp-details")
@TableGenerator(name="emp_seq", initialValue=1, allocationSize=1)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="emp_seq")
	private int id;
//	@Column(name="ename")
	private String name;
//	@Column(name="esal")
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
