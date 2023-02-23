//6. Write a Java Program to find the Intersection of Two Sortedarrays.

import java.lang.*;
import java.util.*;

public class IntersectionOfSortedArray{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the 1st array : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the size of the 2nd array : ");
		int n2 = sc.nextInt();
		
		int array1[] = new int[n1];
		System.out.println("Enter the elements of 1st array : ");
		for(int i = 0; i < n1; i++){
				
			array1[i] = sc.nextInt();
		}

		int array2[] = new int[n2];
		System.out.println("Enter the elements of 2nd array : ");
		for(int j = 0; j< n2; j++){
				
			array2[j] = sc.nextInt();
		}
		
		System.out.println("Array after intersection : ");
		
		for(int k = 0; k < n1; k++){
			
			for(int l = 0; l < n2; l++){
				
				if(array1[k] == array2[l]){
				
					System.out.print(array1[k]+" ");
				}
			}
		}
	}
}