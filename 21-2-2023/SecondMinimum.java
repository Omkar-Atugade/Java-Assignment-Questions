//3. Find the second minimum number in the given array.

import java.lang.*;
import java.util.*;

public class SecondMinimum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i = 0; i < n; i ++){
			
			array[i] = sc.nextInt();
		}
		
		int smallest = array[0];
		
		for(int j = 0; j < n; j++){
			
			if(array[j] < smallest){
				
				smallest = array[j];
			}
		}
		
		int secondSmall = array[0];
		
		for(int k = 0; k < n; k++){
			
			if(array[k] != smallest && array[k] < secondSmall){
				
				secondSmall = array[k];
			}
		}
		
		System.out.println("Second smallest in the array is : "+secondSmall);
	}
}