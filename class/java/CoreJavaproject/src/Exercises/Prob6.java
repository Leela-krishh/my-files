package Exercises;
import java.util.*;
public class Prob6 {
public static void main(String[] args){
	try{
	Name("","");
	}
	catch (Exception e){
		System.out.println("error occured:"+e);
	}
}
public static void Name(String fname, String lname) throws Exception{
//	System.out.println("enter the first name");
//	Scanner sc=new Scanner(System.in);
//	String fname=sc.nextLine();
//	System.out.println("enter the last name");
//	String lname=sc.nextLine();
			if((fname==" ")&&(lname==" ")){
				throw new Exception("invalid",null);
		}
			else
				System.out.println(fname+""+lname);
		}
}
class Name extends Exception{
	Name(String s){
		super(s);
	}
}