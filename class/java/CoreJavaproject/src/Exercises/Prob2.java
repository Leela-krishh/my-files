package Exercises;
import java.util.Scanner;
public class Prob2 {
public static void main(String[] args)
{
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	if(n>=0)
		System.out.println(n+" is +ve");
	else
		System.out.println(n+" is -ve");
}
}
