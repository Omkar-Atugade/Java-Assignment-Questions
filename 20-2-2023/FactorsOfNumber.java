//11. Write a Java Program to print all the Factors of the Given number.

import java.lang.*;
import java.util.*;

public class FactorsOfNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			
			if(n % i == 0){
				
				System.out.println(i);
			}
		}
	}
}