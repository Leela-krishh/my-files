package com.cg.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.mvc.beans.Product;
import com.cg.spring.mvc.repository.IProductRepo;

@Component
public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductRepo repo;
	public List<Product> getAllProducts() {
	
		return repo.getAllProducts();
	}
	public void add(Product p) {
		repo.add(p);
		
	}
	public Product searchById(int id) {
		return repo.searchById(id);
	}

}
