//15. Write a program to find the Most Frequent Element using HashTable.


import java.lang.*;
import java.util.*;

public class FrequentNumberHashTable{
	
	public static int frequentNumber(int a[]){
		
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		
		for(int i : a){
			
			if(hp.containsKey(i)){
				
				hp.put(1, hp.get(i)+1);
			}
			else{
				
				hp.put(i, 1);
			}
		}
		
		int element = 0;
		int frequency = 1;
		     
        
		Set<Map.Entry<Integer, Integer>> entrySet = hp.entrySet();
         
        for (Map.Entry<Integer, Integer> entry : entrySet) 
        {
            if(entry.getValue() > frequency)
            {
                element = entry.getKey();
                 
                frequency = entry.getValue();
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
		
		int x = frequentNumber(array);
		
		System.out.println("Most frequent number is : "+x);
	}
}