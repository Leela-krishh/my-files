package objects;

public class Student {
	public static void main(String[] args){
		Student a=new Student();
		a.ComputeScore(60);
	}
	int score;
	String res;
public void ComputeScore(int score){
	if(score<50){
		res="fail";
		System.out.println(res);
	}
	else{
		res="pass";
		System.out.println(res);
	}
}
}