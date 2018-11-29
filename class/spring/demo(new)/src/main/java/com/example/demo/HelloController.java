package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Product;
import com.example.service.IProductService;

@RestController
@ComponentScan(basePackages="com.example")
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hi, good morning gfhgfhgf";
	}
	@RequestMapping("/add/{name}/{price}")
	public String add(Product p) {
		service.add(p);
		return "Success";
	}
	@RequestMapping("/search/{id}")
	public Product searchById(@PathVariable("id") int id) {
		return service.searchById(id);
	}
	@RequestMapping(value="/delete/{id}")
	public Product del(@PathVariable("id") int id) {
		return service.del(id);
	}
	@Autowired
	IProductService service;
	@RequestMapping("/showall")
	public List<Product> showall(Product p) {
		return service.showall();
	}
	@RequestMapping(value="/update/{id}/{price}")
	public List<Product> update(@PathVariable("id") int id,@PathVariable("price") double price){
	return service.update(id, price);	
	}
}
