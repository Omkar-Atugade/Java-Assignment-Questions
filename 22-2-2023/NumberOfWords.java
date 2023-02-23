//9. How do you count the Number of Wordsin a given String using Split method? 

import java.lang.*;
import java.util.*;

public class NumberOfWords{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		
		System.out.println("Number of words in a sentence : "+str.length);
	}
}