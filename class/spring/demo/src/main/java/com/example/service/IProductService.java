package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bean.Product;

@Service
public interface IProductService {
	List<Product> showall();
	String add(Product p);
	Product searchById(int id);
}
