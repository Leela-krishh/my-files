package com.cg.operators;

class Company {
	String k="this is the parent";
	}
public class Class10 extends Company{
	public void check(){
		String l="this is the child";
		System.out.println("success "+l);
	}
	public void view(Company c){
		if(c instanceof Class10){
			Class10 b1=(Class10)c;
			b1.check();
			System.out.println("success "+k);
		}
		else{
			System.out.println("fail");
		}
	}
	public static void main(String[] args){
		Class10 c=new Class10();
		Class10 e=new Class10();
		e.view(c);
	}
}