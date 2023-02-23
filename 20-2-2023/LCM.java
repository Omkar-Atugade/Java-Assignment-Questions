//17. Write a java program to LCM of TWO given number.

import java.lang.*;
import java.util.*;

public class LCM{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		int lcm = a > b ? a : b;
		
		while(true){
			
			if(lcm % a == 0 && lcm % b == 0){
				
				System.out.println("Lcm of two numbers is : "+lcm);
				break;
			}
			
			++lcm;
		}
		
		//lcm = a * b / gcd;
	
	}
}