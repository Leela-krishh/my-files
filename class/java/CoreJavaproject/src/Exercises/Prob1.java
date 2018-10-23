package Exercises;
import java.util.Scanner;
public class Prob1 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the firstname");
	String fn=sc.nextLine();
	System.out.println("enter lastname");
	String ln=sc.nextLine();
	System.out.println("give gender");
	char g=sc.next().charAt(0);
	System.out.println("give age");
	int age=sc.nextInt();
	System.out.println("enter weight");
	double wt=sc.nextDouble();
	sc.close();
	System.out.println("Person Details");
	System.out.println("--------------");
	System.out.println("Firstname:	"+fn);
	System.out.println("Lastname:	"+ln);
	System.out.println("Gender:		"+g);
	System.out.println("Age:		"+age);
	System.out.println("Weight:		"+wt);
}
}