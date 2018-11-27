package com.cg.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.cg.spring.javaconfig")
public class ProductConfiguration {

	@Bean
	public Product getProduct() {
		Product p=new Product();
		p.setProductName("samsung");
		p.setProductPrice(1000.00);
		return p;
	}

}
