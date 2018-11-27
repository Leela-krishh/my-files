package com.cg.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springxml.xml");
		Customer c=context.getBean(Customer.class);
		System.out.println(c);
	}

}
