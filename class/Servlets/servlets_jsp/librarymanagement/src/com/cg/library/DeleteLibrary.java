package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteLibrary {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("librarymanagement");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
//		Library l1=em.find(Library.class,2);
		Library lib1=new Library();
		Library lib2=em.find(Library.class,3);
		em.remove(lib2);
		em.getTransaction().commit();
	}
}
