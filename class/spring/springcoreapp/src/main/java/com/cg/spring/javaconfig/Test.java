package com.cg.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProductConfiguration.class);
		Product p=context.getBean(Product.class);
		System.out.println(p);

	}

}
