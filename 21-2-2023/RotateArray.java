//16. Write a java program to Rotate the Given Arrayd times. 

import java.lang.*;
import java.util.*;

public class RotateArray{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < n; i++){
		
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number by which you want to rotate the array : ");
		int a = sc.nextInt();
		
		for(int j = 0; j < a; j++){
			
			int start = array[0];
			
			for(int i = 0; i < n-1; i++){
				
				array[i] = array[i+1];
			}
			
			array[n-1] = start;
		}
		
		
		System.out.println("Array after rotation : ");
		for(int i = 0; i < n; i++){
			
			System.out.println(array[i]+" ");
		}
	}
}