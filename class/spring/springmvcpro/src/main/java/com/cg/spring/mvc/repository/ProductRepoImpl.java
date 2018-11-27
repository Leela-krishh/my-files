package com.cg.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.spring.mvc.beans.Product;

@Component
public class ProductRepoImpl implements IProductRepo{

	List<Product> list=new ArrayList();
	public List<Product> getAllProducts() {
	/*	Product p1=new Product();
		p1.setId(list.size()+1);
		p1.setName("moto one power");
		p1.setPrice(15999);
		list.add(p1);
		
		Product p2=new Product();
		p2.setId(list.size()+1);
		p2.setName("one plus 6");
		p2.setPrice(25999);
		list.add(p2);*/
		return list;
	}
	public void add(Product p) {
		/*Product p1=new Product();
		p1.setId(list.size()+1);
		p1.setName("moto one power");
		p1.setPrice(15999);
		list.add(p1);
		
		Product p2=new Product();
		p2.setId(list.size()+1);
		p2.setName("one plus 6");
		p2.setPrice(25999);
		list.add(p2);*/
		p.setId(list.size()+1);
		list.add(p);
	}
	public Product searchById(int id) {
		for(Product p:list) {
			if(p.getId()==id)
			return p;
		}
		return null;
	}

}
