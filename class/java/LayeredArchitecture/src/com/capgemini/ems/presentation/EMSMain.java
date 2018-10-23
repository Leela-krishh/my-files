package com.capgemini.ems.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.ems.dto.Employee;
import com.capgemini.ems.service.EmployeeService;
import com.capgemini.ems.service.EmployeeServiceImpl;

public class EMSMain {

	EmployeeService service=new EmployeeServiceImpl();
	
	public static void main(String[] args){
		System.out.println("Employee Management System");
		System.out.println("1.Add Employee");
		System.out.println("2.Exit");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select your choice:");
		int option = 0;
		
		try{
		option = scanner.nextInt();
		} 

		catch(InputMismatchException e){
			System.out.println("input should contain only digits");
			System.exit(0);
		}
		
		switch(option){
		
		case 1:
			System.out.println("enter id:");
			int id=scanner.nextInt();
			System.out.println("enter name:");
			String name=scanner.nextLine();
			System.out.println("Enter Salary:");
			double salary = scanner.nextDouble();
			
			Employee employee=new Employee(id,name,salary);
			
			break;
		
		case 2:
			System.out.println("Thank u, visit again");
			System.exit(0);
			break;
			
		default:
				System.out.println("Invalid input");
				break;
		}
	}
}
