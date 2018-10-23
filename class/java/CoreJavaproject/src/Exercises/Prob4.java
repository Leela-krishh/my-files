package Exercises;
import java.util.Scanner;
public class Prob4 {
public static void main(String[] args){
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int i=0;
		if(s.charAt(i)<=s.charAt(i+1)){
			System.out.println("positive string");	
			}
		else{
			System.out.println("negative string");
			}
	sc.close();
	}
}