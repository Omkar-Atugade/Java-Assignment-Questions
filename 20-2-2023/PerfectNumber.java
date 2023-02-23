//25. Write a Java Program to check whether the given number is Perfect Numberor NOT. 


import java.lang.*;
import java.util.*;

public class PerfectNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < n; i++){
			
			if(n % i == 0){
				
				sum = sum + i;
			}
		}
		
		if(sum == n){
			
			System.out.println("Number is a perfect number");
		}
		else{
		
			System.out.println("Number is not a perfect number");
		}
	}
}