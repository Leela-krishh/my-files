package com.cg.spring.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.mvc.beans.Product;

@Service
public interface IProductService {

	List<Product> getAllProducts();
	void add(Product p);
	Product searchById(int id);
}
