package com.cg.spring.core;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String args[]) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("springxml.xml");
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("springxml.xml");
		Employee e1=context.getBean(Employee.class);
//		Employee e1=(Employee) context.getBean("emp");
		
		/*e1.setId(123);
		e1.setName("leela");
		e1.setSalary(1000);
		
		inserted within the xml file*/

		System.out.println(e1);

		Manager m1=context.getBean(Manager.class);
		
		/*m1.setDeptno(123);
		m1.setProjectName("Cocacola");
		m1.setProjectCode(120987654);*/

		System.out.println(m1);
		context.close();
	/*	Employee e1=new Employee();
		e1.setName("leela");
		System.out.println(e1);*/
	}
}
