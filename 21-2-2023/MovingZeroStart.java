//11. Write a Java Program to Move all Zeros to Start of the Array. 


import java.lang.*;
import java.util.*;

public class MovingZeroStart{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0; i < n; i++){
			
			array[i] = sc.nextInt();
		}
		
		int count = 0;
		int array2[] = new int[n];
		int j = 0;
		for(int i = 0; i < n; i++){
				
			if(array[i] == 0){
				
				count++;
			}
			else{
				
				array2[j] = array[i];
				j++;
			}
		}
		
		for(int i = 0; i < count; i++){
			
			array[i] = 0;
		}
		
		int k = 0;
		for(int i = count; i < n; i++){
			
			array[i] = array2[k];
			k++;
		}
		
		for(int i : array){
			
			System.out.print(i+" ");
		}
	}
}