//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 

import java.lang.*;
import java.util.*;

public class ArmstrongNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int rem = 0;
		int sum = 0;
		int digits = 0;
		int num = n;
		int num1 = n;
		
		
		while(num != 0){
			
			digits++;
			num = num / 10;
		}
		
		while(num1 != 0){
			
			rem = num1 % 10;
			sum = sum + (int)(Math.pow(rem, digits));
			num1 = num1/10;
		}
		
		if(n == sum){
			
			System.out.println("Number is Armstrong");
		}
		else{
			
			System.out.println("Number is not Armstrong");
		}
		
	}
}