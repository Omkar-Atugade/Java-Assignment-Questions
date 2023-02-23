//13. Write a program to find the Most Frequent Elementin an given array. 

import java.lang.*;
import java.util.*;

public class FrequentNumber{
	
	public static int mostFrequentElement(int a[]){
		
		int maxcount = 0;
		int element = 0;
		
		for(int i = 0; i < a.length; i++){
			
			int count = 0;
			for(int j = 0; j < a.length; j++){
				
				if(a[i] == a[j]){
					
					count++;
				}
			}
			
			if(count > maxcount){
				
				maxcount = count;
				element = a[i];
			}
		}
		
		return element;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < n; i++){
		
			array[i] = sc.nextInt();
		}
		
		int x = mostFrequentElement(array);
		
		System.out.println("Most frequent element is : "+x);
	}
}