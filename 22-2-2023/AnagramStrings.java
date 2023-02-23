//7. Write a Java Program to check two strings are Anagram to each other or NOT.

import java.lang.*;
import java.util.*;

public class AnagramStrings{

	public static boolean checkAnagram(String a, String b){
		
		String str1 = a.replaceAll("[^A-Za-z]", "");
		
		String str2 = b.replaceAll("[^A-Za-z]", "");
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string : ");
		String s1 = sc.next();
		
		System.out.println("Enter the 2nd string : ");
		String s2 = sc.next();
		
		boolean x = checkAnagram(s1, s2);
		
		if(x){
			
			System.out.println("Strings are anagram");
		}
		else{
			
			System.out.println("Strings are not anagram");
		}
	}
}
