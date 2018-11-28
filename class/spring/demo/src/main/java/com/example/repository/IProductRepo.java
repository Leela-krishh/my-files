package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.Product;

@Repository
public interface IProductRepo {
	
	String add(Product p);
	
	Product searchById(int p);

	List<Product> showall();

}
