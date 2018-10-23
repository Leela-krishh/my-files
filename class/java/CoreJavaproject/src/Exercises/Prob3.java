package Exercises;
//import java.io.*;
import java.lang.String;
import java.util.Scanner;
public class Prob3 {
	
	void add(){
		System.out.println("enter the string to add");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str+" "+str);
		sc.close();
	}
	
	void replacement(){
		System.out.println("enter the string to be replaced");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0; i<=str.length();i++){
			if(i%2!=0){
				str=str.substring(0,i-1)+"#"+str.substring(i,str.length());
			}
		}
			System.out.println(str+" is the replaced string");
		sc.close();
	}
	
	void duplicates(){
		System.out.println("enter the string to remove duplicates");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<=str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					//str.charAt(j)=' ';
					str=str.replace(str.charAt(j),'\0');
				}
			}
		}sc.close();
		System.out.println(str+" is the new string");
	}
	
	void upperCase(){
		System.out.println("enter the string to be replaced");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		for(int i=0; i<=str.length();i++){
			char ch = str.charAt(i);
		    if (i % 2 == 0) {
		    	ch=Character.toUpperCase(ch);
		    	}
		    str1=str1+ch;	
		}
			System.out.println(str1+" is the replaced string");
		sc.close();
	}
	
	public static void main(String[] args){
	System.out.println("enter the operation to be performed");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Prob3 r=new Prob3();
	switch(n)
	{
		case 1: r.add();
		break;
		case 2: r.replacement();
		break;
		case 3: r.duplicates();
		break;
		case 4: r.upperCase();
		break;
	}
	sc.close();
	
}
}