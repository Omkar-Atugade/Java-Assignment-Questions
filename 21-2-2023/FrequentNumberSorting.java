//14. Write a program to find the Most Frequent Element using Sorting. 

import java.lang.*;
import java.util.*;

public class FrequentNumberSorting{
	
	public static int mostFrequentElement(int a[]){
		
		Arrays.sort(a);
		
		int count = 1;
		int maxcount = 1;
		int element = a[0];
		
		for(int i = 1; i < a.length; i++){
			
			if(a[i] == a[i-1]){
				
				count++;
			}
			else{
				
				count = 1;
			}
			
			if(count > maxcount){
				
				maxcount = count;
				element = a[i-1];
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