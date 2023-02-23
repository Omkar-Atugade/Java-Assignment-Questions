//15. Write a java program to Reverse a given number. 

import java.lang.*;
import java.util.*;

public class ReverseNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int rem = 0;
		int sum = 0;
		
		while(n != 0){
			
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		
		System.out.println("Reversed number is : "+sum);
	}
}