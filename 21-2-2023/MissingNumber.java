//4. Find the missing Number in the given array of 1 to N.

import java.lang.*;
import java.util.*;

public class MissingNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0; i < n; i++){
			
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		sum = n * (n+1) / 2;
		
		int sum1 = 0;
		for(int i : array){
			
			sum1 = sum1 + i;
			
		}
		
		System.out.println("Missing number in the array is : "+(sum - sum1));
	}
}