//12. Write a Java Program to find sum of the digits of a given number.

import java.lang.*;
import java.util.*;

public class SumOfDigits{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int rem = 0;
		int sum = 0;
		
		while(n != 0){
		
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		
		System.out.println("Sum of the digits of the given number is : "+sum);
	}
}