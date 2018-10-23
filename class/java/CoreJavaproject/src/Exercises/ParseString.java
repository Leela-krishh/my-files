package Exercises;
import java.util.Scanner;
public class ParseString {
public static void main(String[] args){
	Scanner sc=new Scanner("1,2,3,4,5,6,7,8").useDelimiter(",");
	while(sc.hasNextInt()){
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println(num);
			}
		}
	}
}