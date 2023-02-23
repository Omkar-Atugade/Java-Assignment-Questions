//1. Write a java program to check Given String is Palindrome or NOT.

import java.lang.*;
import java.util.*;

public class PalindromeString{

	public static boolean checkPalindrome(String str){
		
		String s1 = str.replaceAll("[^A-Za-z]", "");

		char c[] = s1.toCharArray();
		
		for(int i = 0; i < c.length; i++){
			
			if(c[i] != c[c.length-1-i]){
				
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		boolean x = checkPalindrome(s);
		
		if(x){
			
			System.out.println("String is palindrome");
		}
		else{
			
			System.out.println("String is not palindrome");
		}
		
	}
}
