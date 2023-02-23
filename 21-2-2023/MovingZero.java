// 10. Write a Java Program to Move all Zero to End of the Array. 

import java.lang.*;
import java.util.*;

public class MovingZero{
	
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
		
		for(int i = array2.length; i < n; i++){
			
			array2[i] = 0;
		}
		
		for(int i : array2){
			
			System.out.print(i+" ");
		}
	}
}