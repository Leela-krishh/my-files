package com.cg.spring.jpa.springdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spring.jpa.springdata.bean.Product;

@Service
public interface IProductservice {
	public List<Product> getAllProducts();
	public void addproduct(int id,String name,double price);
	public String update(int id,String name,double price);
	public String delete(int id);
}
