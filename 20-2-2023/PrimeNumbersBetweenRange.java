//22. Write a Java Program to print Prime Numbers from 1 to N. 

import java.lang.*;
import java.util.*;

public class PrimeNumbersBetweenRange{
	
	public static boolean isPrime(int a){
		
		for(int i= 2; i < a; i++){
		
			if(a % i == 0){
				
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		int c = 0;
		
		for(int j = 2; j < n; j++){
		
			if(isPrime(j)){
				
				System.out.print(j+" ");
			}
		}
		
		
	}
}