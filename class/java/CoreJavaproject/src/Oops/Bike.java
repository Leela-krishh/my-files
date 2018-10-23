package Oops;

abstract class Bike {
abstract void run();
void brake(){
	System.out.println("testing the braking");
}
}

class Abstract1 extends Bike{
	void run(){
		System.out.println("running safely");
	}
	public static void main(String[] args){
		Bike obj=new Abstract1();
		obj.run();
		obj.brake();
	}
}