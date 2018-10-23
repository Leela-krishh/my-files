package Oops;
// Java program to check if given mobile number 
// is valid. 
import java.util.regex.*; 
public class Phone {
	    public static boolean isValid(String s) 
	    {
	        // The given argument to compile() method  
	        // is regular expression. With the help of  
	        // regular expression we can validate mobile 
	        // number.  
	        // 1) Begins with 0 or 91 
	        // 2) Then contains 7 or 8 or 9. 
	        // 3) Then contains 9 digits 
	        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	        // Pattern class contains matcher() method 
	        // to find matching between given number  
	        // and regular expression 
	        Matcher m = p.matcher(s); 
	        return (m.find() && m.group().equals(s)); 
	    } 
	    public static void main(String[] args) 
	    {
	        String s = "9999999999";
	        if (isValid(s))  
	            System.out.println(s+" is Valid Number");         
	        else 
	            System.out.println(s+" is Invalid Number");         
	    } 
	}