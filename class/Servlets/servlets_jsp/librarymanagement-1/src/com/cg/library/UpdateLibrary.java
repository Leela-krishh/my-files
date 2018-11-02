package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateLibrary {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("librarymanagement");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Library l1=em.find(Library.class,4);
//		l1.setBookName("java");
//		l1.setBookPrice(10000);
//		em.getTransaction().commit();
		if(l1!=null){
			l1.setBookName("core java");
			l1.setBookPrice(20000);
		}
		else{
			System.out.println("no data found");
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
