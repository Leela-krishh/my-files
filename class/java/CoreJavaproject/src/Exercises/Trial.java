package Exercises;
public class Trial {
	int a=10;
	double c=2.5;
//	--------------------------------------
	 int num(int b, double d)
	{
		int a=12;
		double c=9.0;
		System.out.println(a+b+c+" |"+ a+"| "+b+"| "+c+" |"+(a+b+c));
		return 0;
	}
//		-------------------------------------
	 int num(double d, int b)
	{
		int a=6;
		double c=9.0;
		System.out.println(a+b+c+" |"+ a+"| "+b+"| "+c+" |"+(a+b+c));
		return 0;
	}
//		-------------------------------------
	 public static void main(String[] args)
		{
			int a=11;
			double c=6.0;
			Trial r=new Trial();
			System.out.println(a+ r.a +c+" |"+a+"| "+r.a+" |"+c);
			r.num(4,60.0);
			
		}
}