//17. Find the pair of elements(X+Y) in the array whose sum is equal to given number Z.

import java.lang.*;
import java.util.*;

public class SumOfPairs{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i = 0; i < n; i++){
			
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the sum : ");
		int target = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			
			for(int j = i+1; j < n; j++){
				
				if(array[i] + array[j] == target){
					
					System.out.print(array[i]+ " "+array[j]);
				}
			}
		}
	}
}