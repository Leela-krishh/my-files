package com.cg.spring.trial;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {

	private int patientId;
	private String patientName;
	private String problem;
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", problem=" + problem + "]";
	}
	public Patient(int patientId, String patientName, String problem) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.problem = problem;
	}
	public Patient() {}
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("init method");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("pre destroy method");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("post constructor init method");
	}
 
 public void destroy(){
	 System.out.println("destroy method");
 }
 public void init() {
	 System.out.println("init method from xml");
 }
 public void destroyBean() {
	 System.out.println("destroy method from xml");
 }
	
}
