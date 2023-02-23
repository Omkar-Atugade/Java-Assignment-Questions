//21. Write a Java Program to check whether the Given Number is Prime Number or NOT.

import java.lang.*;
import java.util.*;

public class PrimeNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int c = 0;
		
		for(int i = 2; i < n; i++){
			
			if(n % i == 0){
				
				c++;
			}
		}
		
		if(c == 0){
			
			System.out.println("Number is prime number");
		}
		else{
			
			System.out.println("Number is not prime number");
		}
	}
}