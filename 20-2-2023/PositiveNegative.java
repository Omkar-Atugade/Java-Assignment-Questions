//7. How to check the given number is Positive or Negative in Java? 

import java.lang.*;
import java.util.*;

public class PositiveNegative{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(String[] args);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		if(n == 0){
			
			System.out.println("Number is neither negative nore positive");
		}
		else if(n > 0){
			
			System.out.println("Number is Positive");
		}
		else{
			
			System.out.println("Number is Negative");
		}
	}		
}	