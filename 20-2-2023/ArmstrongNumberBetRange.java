//24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000. 


import java.lang.*;
import java.util.*;

public class ArmstrongNumberBetRange{
	
	public static boolean isArmstrong(int n){
		
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
			
			return true;
		}
		else{
			
			return false;
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		for(int i = 1; i < a; i++){
			
			if(isArmstrong(i)){
				
				System.out.print(i+" ");
			}
		}
		
	}
}