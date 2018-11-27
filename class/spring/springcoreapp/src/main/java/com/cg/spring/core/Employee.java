package com.cg.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	private int id;
	private String name;
	private double salary;
/*	public int getId() {
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
	instead getters and setters we use onstructor for fields*/
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void afterPropertiesSet() throws Exception{
		System.out.println("init method for employee bean");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("pre destroy method for employee bean");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("post constructor init method for emp bean");
	}
 public Employee() {}
 
 public void destroy(){
	 System.out.println("destroy method for bean");
 }
 public void init() {
	 System.out.println("init method calling from xml");
 }
 public void destroyBean() {
	 System.out.println("destroy method calling from xml");
 }
}
