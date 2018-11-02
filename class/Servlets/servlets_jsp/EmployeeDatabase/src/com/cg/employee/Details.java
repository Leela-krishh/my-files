package com.cg.employee;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Details {

	public static void main(String[] args) {
		System.out.println("Employee database connected");
		System.out.println("-----------------");
		System.out.println("1.add");
		System.out.println("2.update");
		System.out.println("3.delete");
		System.out.println("4.view");
		System.out.println("5.search by id");
		System.out.println("6.exit");
		System.out.println("-----------------");
		System.out.println( "enter the option to perform the operation");
		Scanner sc=new Scanner(System.in);
		int option=0;
		
		try{
		option=sc.nextInt();
		sc.nextLine();
		}
		catch(Exception e){
			System.out.println("enter only numeric data");
		}
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("EmployeeDatabase");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		switch(option){
		case 1:
			Employee e1=new Employee();
			System.out.println("enter name of the employee:");
			String name=sc.nextLine();
			e1.setName(name);
			System.out.println("enter salary:");
			double salary=sc.nextDouble();
			e1.setSalary(salary);
			em.persist(e1);
			System.out.println("details added successfully");
			break;
			
		case 2:
			System.out.println("enter id to update");
			int id=sc.nextInt();
			Employee e2=em.find(Employee.class,id);
			if(e2!=null){
				System.out.println("enter name of the employee:");
				String name1=sc.nextLine();
				e2.setName(name1);
				sc.nextLine();
				System.out.println("enter salary:");
				double salary1=sc.nextDouble();
				e2.setSalary(salary1);
				em.persist(e2);
				System.out.println("details updated successfully");
			}
			else{
				System.err.println("no data found, try again!!");
			}
			break;
			
		case 3:
			System.out.println("enter id to delete");
			int id1=sc.nextInt();
			Employee e3=em.find(Employee.class,id1);
			em.remove(e3);
			System.out.println("employee data with "+id1+" deleted Succesfully");
			break;
			
		case 4:
			Query q=em.createQuery("select e from Employee e");
			List<Employee> list=q.getResultList();
			for(Employee e:list){
				System.out.println();
				System.out.println("Id: "+e.getId());
				System.out.println("Name: "+e.getName());
				System.out.println("Price: "+e.getSalary());
			}
			break;
			
		case 5:
			System.out.println("enter id to view details");
			int id2=sc.nextInt();
			Employee e4=em.find(Employee.class,id2);
			if(e4!=null){
			System.out.println("-----------------");
			System.out.println("Id: "+e4.getId());
			System.out.println("Name: "+e4.getName());
			System.out.println("Price: "+e4.getSalary());
			System.out.println("-----------------");
			}
			else{
				System.out.println("no employee with such id");
			}
			break;
			
		case 6:
			System.exit(0);
			break;
			
		default:
			System.out.println("enter correct option");
			break;
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
