//4. Swap two numbers without using third variable approach 1. 

import java.lang.*;
import java.util.*;

public class SwapNumber1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a  = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Before swap : a = "+a+" and b = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap : a = "+a+" and b = "+b);
	}
}

