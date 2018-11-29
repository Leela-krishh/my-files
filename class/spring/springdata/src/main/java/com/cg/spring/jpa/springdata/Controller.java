package com.cg.spring.jpa.springdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.jpa.springdata.bean.Product;
import com.cg.spring.jpa.springdata.service.IProductservice;

@RestController
@ComponentScan(basePackages="com.cg.spring.jpa.springdata")
public class Controller {
	@Autowired
	IProductservice service;
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	@RequestMapping(value="/add/{id}/{name}/{price}")
	public void addproduct(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("price") double price) {
           service.addproduct(id,name,price);
}
	@RequestMapping(value="/update/{id}/{name}/{price}")
	public void update(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("price") double price) {
        service.update(id,name,price);
}
	@RequestMapping(value="/delete/{id}")
	public void delete(@PathVariable("id") int id) {
        service.delete(id);
}
}
