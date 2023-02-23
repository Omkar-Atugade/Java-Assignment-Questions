// 10. Write a Java Program to Print All Combinationsof a given String.

import java.lang.*;
import java.util.*;

public class AllPossibleCombo{

	public static void combination(String res, String ans){
		
		if(res.length()==0){
			
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < res.length(); i++){
			
			char c = res.charAt(i);
			String str = res.substring(0, i) +  res.substring(i+1);
			combination(str, ans+c);
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		combination(s, "");
	}
}