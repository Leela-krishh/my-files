package Oops;

interface Bike1 {
void run();
void brake();
void speed();

}
class Interface1 implements Bike1{
	public void run(){
		
	}
	public void brake(){
		
	}
	public void speed(){
		
	}
	public static void main(String[] args){
		Interface1 i=new Interface1();
		i.speed();
		i.brake();
		i.run();
	}
}