package Exercises;

import java.lang.*;
import java.util.*;
public class Prob6a {
public static void main(String[] args) throws Exception{
	System.out.println("enter the first name");
	Scanner sc=new Scanner(System.in);
	String fname=sc.nextLine();
	System.out.println("enter the last name");
	String lname=sc.nextLine();
		try{
			if((fname.isEmpty())&&(lname.isEmpty()))
				throw new Exception();
			else
				System.out.println(fname+""+lname);
		}
		catch (Exception e){
			System.out.println("error occured");
		}
	}
}