//8. Write a Java program to find the Most Repeated Character in the Given String. 

import java.lang.*;
import java.util.*;

public class RepeatedCharacters{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		char c[] = s.toCharArray();
		
		int maxcount = 0;
		
		char element = 'a';
		
		for(int i = 0; i < c.length; i++){
			
			int count = 0;
			for(int j = 0; j < c.length; j++){
				
				if(c[i] == c[j]){
					
					count++;
				}
			}
			
			if(count > maxcount){
				
				maxcount = count;
				element = c[i];
			}
		}
		
		System.out.println("Most frequent character is : "+element);
	}
}