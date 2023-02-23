//2. How to Swap two Strings without using third (temporary) variable? 

import java.lang.*;
import java.util.*;

public class SwappingStrings{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string : ");
		String s1 = sc.next();
		
		System.out.println("Enter the 2nd string : ");
		String s2 = sc.next();
		
		System.out.println(" Before Swapping : s1 = "+s1+" and s2 = "+s2);
		
		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		System.out.println(" After Swapping : s1 = "+s1+" and s2 = "+s2);
	}
}