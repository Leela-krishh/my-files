package Exercises;
import java.util.Scanner;
enum Gender{M,F,m,f;}
public class Prob5 {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); 
for (Gender printGender : Gender.values())
System.out.println("The valid gender values are: "+printGender);
 
System.out.println("\n\n\nCommand Line Inputs of Persons");
System.out.println("First Name: ");
String fname = sc.nextLine();     
Character k;
System.out.println("Last Name: ");
String lname = sc.nextLine(); 
boolean flag = true;      
//while(true)
//try
{
do{
System.out.print ("Gender: ");
k = sc.next().charAt(0);
//System.out.println("Gender: " + Gender.valueOf(sc.next()));  
 
 if(k!='M') {
 System.out.println("Not a valid input, please enter again"); }
 else
    flag = false;
} while(flag);
}
//System.out.println("Person Details:");
//catch (IllegalArgumentException InvalidGender)
//{
//System.out.println("Error: " + InvalidGender);
//}      
//finally{
System.out.println("Person Details:");
        System.out.println("---------------");
        System.out.println("First Name: "+fname); 
        System.out.println("Last Name: "+lname);
        System.out.println("Gender: " + Gender.valueOf(k.toString())); /* Here i cannot get resolve the input . output is fine but I need in an an order. */
sc.close();
}
}