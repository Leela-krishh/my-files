package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bean.Product;
import com.example.repository.IProductRepo;

@Component
public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductRepo repo;
	public List<Product> showall() {
		return repo.showall();
	}
	@Override
	public Product searchById(int id) {
		return repo.searchById(id);
	}
	@Override
	public String add(Product p) {
		return repo.add(p);
	}
	@Override
	public Product del(int id) {
		return repo.del(id);
	}
	@Override
	public List<Product> update(int id, double price){
		return repo.update(id, price);
	}
}
