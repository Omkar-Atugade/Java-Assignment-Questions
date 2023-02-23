//19. Check whether the Given Number is a Palindrome or NOT. 

import java.lang.*;
import java.util.*;

public class Palindrome{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int rem = 0;
		int rev = 0;
		int num = n;
		
		while(num != 0){
			
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		
		if(rev == n){
			
			System.out.println("Number is palindrome");
		}
		else{
			
			System.out.println("Number is not palindrome");
		}
	}
}