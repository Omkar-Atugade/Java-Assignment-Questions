
//1. Check the given number is EVEN or ODD. 

import java.lang.*;
import java.util.*;

public class EvenOdd{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		
		if(n == 0){
			
			System.out.println("Number is neither even nor odd");
			
		}
		else if(n % 2 == 0){
			
			System.out.println("Number is even");
			
		}
		else{
			
			System.out.println("Number is odd");
		}
		
		
	}
}