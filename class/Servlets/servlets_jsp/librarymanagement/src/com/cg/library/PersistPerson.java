package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("librarymanagement");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
//		Address a=new Address();
//		a.setCity("hyderabad");
//		a.setState("telangana");
//		Person p=new Person();
//		p.setId(123);
//		p.setName("devudu");
//		p.getAddress().add(a);
//		em.persist(p);
		Employee e1=new Employee(101, "alludu seenu", 100000.00);
		em.persist(e1);
		em.getTransaction().commit();

	}

}
