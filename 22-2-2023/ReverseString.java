//3. Write a java program to Reverse a Stringwithout using in-build function. 

import java.lang.*;
import java.util.*;

public class ReverseString{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		String res = "";
		
		for(int i = s.length()-1; i >= 0; i--){
			
			res = res + s.charAt(i);
		}
		
		System.out.println("Reversed string is : "+res);
	}
}