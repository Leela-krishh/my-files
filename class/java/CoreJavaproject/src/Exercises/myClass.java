package Exercises;

import java.util.Scanner;

public class myClass {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a = 0,b=0;
		char operation=' ';
		
		try{
		System.out.print("enter first no: ");
		a = sc.nextDouble();
		System.out.print("enter second no: ");
		b = sc.nextDouble();
		System.out.print("select operators among {+, -, *, /, %, ^}: ");
		operation=sc.next().charAt(0);
		
		switch(operation){
		case '+':
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
			
		case '-':
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
			
		case '*':
			System.out.println(a+" * "+b+" = "+(a*b));
			break;
			
		case '/':
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
			
		case '%':
			System.out.println(a+" % "+b+" = "+(a%b));
			break;
			
		case '^':
			double res=1;
			for(double i=0;i<b;i++){
				res=res*a;
			}
			System.out.println(a+" ^ "+b+" = "+res);
			break;
			
			default:
				System.out.println("enter correct operators as mentioned");
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("enter only numbers");
		}
	}
}
