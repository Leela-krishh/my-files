package Exercises;
public class This {
	
	int x=99;
	
	public void method(){
	int	x=33;
	System.out.println(x);
	System.out.println(this.x);
	}
//-----------------------------------
	public void method1(){
	int	x=66;
	System.out.println(x);
	System.out.println(this.x);
	}
//-----------------------------------
	public static void main(String[] args)
	{
		This a=new This();
		This b=new This();	
		a.method();
		System.out.println(a.x);
		b.method1();
	}
}