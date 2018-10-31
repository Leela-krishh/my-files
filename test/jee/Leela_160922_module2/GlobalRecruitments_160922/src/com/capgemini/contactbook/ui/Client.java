package com.capgemini.contactbook.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import com.capgemini.contactbook.service.ContactBookService;
import com.capgemini.contactbook.service.ContactBookServiceImpl;
import com.igate.contactbook.bean.EnquiryBean;
 import com.capgemini.contactbook.exception.*;

public class Client {

	static Logger logger = Logger.getLogger(Client.class);

	//user interface which display the operation menu to add an enquiry, search an enquiry
	
	public static void main(String[] args)	
	{
		PropertyConfigurator.configure("resources/log4j.properties");
		logger.info("log4j got loaded..");
		logger.info("inside the main method");
		
		ContactBookService service = new ContactBookServiceImpl();

		//object for the service to execute the respective methods
		
		Scanner scanner = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("***********Global Recruitments***********");
			System.out.println("choose an operation");
			System.out.println("1.Enter enquiry details");
			System.out.println("2.View enquiery details on id");
			System.out.println("0.Exit");
			System.out.println("Please enter a choice:");
			
			int choice=0;
			
			try
			{
			 choice = scanner.nextInt();
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Enter only digits:");
			}

			switch (choice) {

			case 1:
				
				scanner.nextLine();
				EnquiryBean enqbean = new EnquiryBean();
				System.out.println("Enter First Name:");
				String fname = scanner.nextLine();
				enqbean.setfName(fname);
				
				System.out.println("Enter Last Name:");
				String lname = scanner.nextLine();
				enqbean.setlName(lname);
				
				System.out.println("Enter Contact Number:");
				String contactno=scanner.nextLine();
				enqbean.setContactNo(contactno);
				
				System.out.println("Enter Preferred Domain:");
				String domain=scanner.nextLine();
				enqbean.setpDomain(domain);

				System.out.println("enter prefered location");
				String location=scanner.nextLine();
				enqbean.setpLocation(location);

				try {
					boolean result = service.isValidEnquiry(enqbean);
						if(result)
						{
							int id = service.addEnquiry(enqbean);
							System.out.println("Thank you: "+enqbean.getfName()+" "+enqbean.getlName()+"your unique id is:"+id);
						}
				} 
				catch (ContactBookException e) 
				{
					System.err.println(e.getMessage());
				}
				break;
				
			case 2:
				
				System.out.println("Enter the enquiry no");
				int id=0;
				
				try{
					id = scanner.nextInt();
				}
				
				catch(InputMismatchException e)
				{
					System.err.println("Enter only digits");
				}
				
				EnquiryBean enqbean1;
				try 
				{
					enqbean1 = service.getEnquiryDetails(id);
					System.out.println(enqbean1);

				}
				catch (ContactBookException e) 
				{
					System.err.println(e.getMessage());
				}
				break;
			
			case 0:
			
				System.out.println("Thank you selecting us!!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
