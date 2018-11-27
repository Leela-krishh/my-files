package com.cg.spring.trial;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatient {

	public static void main(String args[]) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Patient p=context.getBean(Patient.class);
		System.out.println(p);
		context.close();
	}
}
