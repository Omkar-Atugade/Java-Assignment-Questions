//1. Calculate the average of given array.

import java.lang.*;
import java.util.*;

public class AverageArray{
	
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
		
		for(int i : array){
			
			sum = sum + i;
		}
		
		System.out.println("Average of the array is : "+sum/n);
	}
}
