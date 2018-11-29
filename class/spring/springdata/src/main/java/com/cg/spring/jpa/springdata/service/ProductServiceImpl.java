package com.cg.spring.jpa.springdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.jpa.springdata.bean.Product;
import com.cg.spring.jpa.springdata.repository.IProductRepo;

@Component
public class ProductServiceImpl implements IProductservice{
@Autowired
IProductRepo repo;


public List<Product> getAllProducts() {
	
	return repo.getAllProducts();
}


@Override
public void addproduct(int id, String name, double price) {
	 repo.addproduct(id,name,price);
	
}


@Override
public String update(int id, String name, double price) {
	
	return repo.update(id,name,price);
}


@Override
public String delete(int id) {
	
	return repo.delete(id);
}

}
