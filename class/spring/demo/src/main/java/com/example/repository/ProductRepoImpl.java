package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.bean.Product;

@Component
public class ProductRepoImpl implements IProductRepo{
	List<Product> list=new ArrayList<Product>();
	public List<Product> showall() {
		Product p1=new Product();
		p1.setId(list.size()+1);
		p1.setName("moto");
		p1.setPrice(100000);
		list.add(p1);
		return list;
	}

	public Product searchById(int id) {
		for(Product p:list) {
			if(p.getId()==id)
				return p;
		}
		return null;
	}
	public String add(Product p) {
		p.setId(list.size()+1);
		list.add(p);
		return null;
	}

}
