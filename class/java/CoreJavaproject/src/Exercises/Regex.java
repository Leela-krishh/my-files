package Exercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

	 public static void main(String[] args){
		 boolean b=false;
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(Pattern.matches("[a-zA-Z]{3}",name))
			b=true;
		System.out.println(b);
	}
}
