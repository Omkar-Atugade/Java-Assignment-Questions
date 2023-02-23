// 10. Write a Java Program to print the digits of a Given Number. 

import java.lang.*;
import java.util.*;

public class DigitsOfNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		String s = Integer.toString(n);
		
		char[] c = s.toCharArray();
		
		for(char i : c){
			
			System.out.println(i);
		}
	
	}
}