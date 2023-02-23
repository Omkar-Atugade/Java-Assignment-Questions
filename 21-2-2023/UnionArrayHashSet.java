//9. Write a Java Program to find the Union of Tow Arrays using HashSet. 


import java.lang.*;
import java.util.*;

public class UnionArrayHashSet{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of 1st array : ");
		int n1 = sc.nextInt();
		
		
		System.out.println("Enter the size of 2nd array : ");
		int n2 = sc.nextInt();
		
		int array1[] = new int[n1];
		
		System.out.println("Enter the elements in 1st array : ");
		for(int i = 0; i < n1; i++){
			
			array1[i] = sc.nextInt(); 
		}
		
		int array2[] = new int[n2];
		
		System.out.println("Enter the elements in the 2nd array : ");
		for(int j = 0; j < n2; j++){
			
			array2[j] = sc.nextInt(); 
		}
		
		HashSet<Integer> s1 = new HashSet<Integer>();
		
		for(int i = 0; i < n1; i++){
			
			s1.add(array1[i]);
		}
		
		
		for(int i = 0; i < n2; i++){
			
			s1.add(array2[i]);
		}
		
		for(int i : s1){
			
			System.out.print(i+" ");
		}
	}
}