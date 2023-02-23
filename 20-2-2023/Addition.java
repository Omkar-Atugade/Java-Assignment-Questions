//14. How to add two numbers without using the arithmetic operators in Java? 

import java.lang.*;
import java.util.*;

public class Addition{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		while(b != 0){
			
			a++;
			b--;
		}
		
		System.out.println("Addition of two number is : "+a);
	}
}