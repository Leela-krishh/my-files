package com.cg.library;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectLibrary {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("librarymanagement");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query q=em.createNamedQuery("select_library");
//		Query q=em.createQuery("select l1 from Library l1");
		List<Library> list=q.getResultList();
		for(Library lib:list){
			System.out.println("==============");
			System.out.println("Id: "+lib.getId());
			System.out.println("Name: "+lib.getBookName());
			System.out.println("Price: "+lib.getBookPrice());
			em.getTransaction().commit();
		}
	}

}
