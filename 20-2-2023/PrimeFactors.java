//20. Write a Java Program to print all the Prime Factors of the Given Number. 

import java.lang.*;
import java.util.*;

public class PrimeFactors{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 2; i < n; i++){
			
			while(n % i == 0){
				
				System.out.println(i);
				n = n / i;
			}
		}
		
		if(n > 2){
			
			System.out.println(n);
		}
	}
}