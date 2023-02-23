//26. Write a Java Program to print Perfect Numbersbetween 1 to 1000.


import java.lang.*;
import java.util.*;

public class PerfectNumberBetRange{


	public static boolean isPerfect(int n){
		
		int sum = 0;
		
		for(int i = 1; i < n; i++){
			
			if(n % i == 0){
				
				sum = sum + i;
			}
		}
		
		if(sum == n){
			
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
		
		for(int j = 0; j < a; j++){
			
			if(isPerfect(j)){
				
				System.out.print(j+" ");
			}
		}
	}
}