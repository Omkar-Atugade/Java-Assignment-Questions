//13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

import java.lang.*;
import java.util.*;

public class SmallestNumber{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number :");
		int b = sc.nextInt();
		
		System.out.println("Enter the 3rd number :");
		int c = sc.nextInt();
		
		int x = 0;
		
		while(a != 0 && b != 0 && c != 0){
		
			a--;
			b--;
			c--;
			x++;
		}
		
		System.out.println("Smallest number is : "+c);
	}
}
