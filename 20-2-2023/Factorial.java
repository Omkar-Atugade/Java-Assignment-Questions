//2. Write a Java Program to find the Factorialof given number. 

import java.lang.*;
import java.util.*;

public class Factorial{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		int fact = 1;
		
		while(n >= 1){
			
			fact = fact * n;
			n--;
			
		}
		
		System.out.println("Factorial of number is : "+fact);
	}
}