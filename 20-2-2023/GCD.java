//16. Write a Java Program to find GCD of two given numbers.

import java.lang.*;
import java.util.*;

public class GCD{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		int temp = a < b ? a : b;
		
		int highest = 1;
		
		for(int i = 1; i <= temp; i++){
			
			if(a % i == 0 && b % i == 0){
			
				if(i > highest){
					
					highest = i;
				}
			}
		}
		
		System.out.println("GCD of numbers is : "+highest);
		
	}
}