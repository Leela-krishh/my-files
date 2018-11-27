package com.cg.spring.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.mvc.beans.Product;

@Repository
public interface IProductRepo {
	
	List<Product> getAllProducts();
	
	void add(Product p);
	
	Product searchById(int p);
}
