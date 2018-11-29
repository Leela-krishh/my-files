package com.cg.spring.jpa.springdata.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.spring.jpa.springdata.bean.Product;

@Repository
public interface IProductRepo {
	public List<Product> getAllProducts();
	public void addproduct(int id,String name,double price);
	public String update(int id,String name,double price);
	public String delete(int id);
}
