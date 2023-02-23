//2. Find the second largest number in the given array.

import java.lang.*;
import java.util.*;

public class SecondLargest{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int i;
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		
		for(i = 0; i < n; i++){
			
			array[i] = sc.nextInt(); 
		}
		
		int j = 0;
		int highest = array[j];
		
		for(j = 0; j < n; j++){
			
			if(array[j] > highest){
				
				highest = array[j];
			}
		}
		
		System.out.println("Second largest in the array is : "+highest);
		
		int k = 0;
		int secondHigh = array[k];
		for(k = 0; k < n; k++){
			
			if(array[k] != highest && array[k] > secondHigh){
					
				secondHigh = array[k];
			}
		}
		
		System.out.println("Second largest in the array is : "+secondHigh);
				
	}
}