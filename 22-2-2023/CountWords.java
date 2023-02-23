//4. Write a java program to Count the Number of Wordsin a given String. 

import java.lang.*;
import java.util.*;

public class CountWords{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		
		System.out.println("Count of words in the sentence is : "+str.length);
	}
}