package com.cg.spring.jpa.springdata.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.spring.jpa.springdata.bean.Product;

@Component
public class ProductRepoImpl implements IProductRepo{
  List<Product> list;
  @Autowired
  EntityManager entityManager;
  
	@Override
	@Transactional
	public List<Product> getAllProducts() {
		Query q=entityManager.createQuery("from Product");
		list=q.getResultList();
		return list;
//		p.setId(list.size()+1);
//		p.setName("gowthami");
//		p.setPrice(1234);
//		list.add(p);
//		entityManager.persist(p);
//		Product p1=new Product();
//		p1.setId(list.size()+1);
//		p1.setName("niha");
//		p1.setPrice(4567);
//		list.add(p1);
//		entityManager.persist(p1);
		
	}
	
@Transactional
	@Override
	public void addproduct(int id, String name, double price) {
		Product p=new Product();
		p.setId(id);
		
		p.setName(name);
		p.setPrice(price);
		//list.add(p);
		entityManager.persist(p);
	}
@Transactional
@Override
public String update(int id, String name, double price) {
	Product p1=entityManager.find(Product.class, id);
	p1.setName(name);
	p1.setPrice(price);
	entityManager.persist(p1);
	return null;
}
@Transactional
@Override
public String delete(int id) {
	Product p2=entityManager.find(Product.class, id);
	entityManager.remove(p2);
	return null;
}
	
}
