//5. Write a java program to Count the Number of Vowelsin the given string. 

import java.lang.*;
import java.util.*;

public class CountVowels{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				
				count++;
			}
		}
		
		System.out.println("Number of vowels are : "+count);
	}
}