//3. Find the Factorial of a number using Recursion. 

import java.lang.*;
import java.util.*;

public class FactorialRecursion{

	public static int factorial(int a){
		
		if(a == 1){
			
			return 1;
		}
		
		return a * factorial(a-1);
	}	
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int x = factorial(n);
		
		System.out.println("Factorial of number is : "+x);
	}
}