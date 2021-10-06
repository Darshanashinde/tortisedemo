package assignment3;

import java.util.ArrayList;
//import java.lang.reflect.Array;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> mylist=new ArrayList();
		List myList=new ArrayList();		
		
		//myList.add(array[j]);	
		
		
		int []array =new int  [] {2,6,9,10,50,60,80,50,9,34,2};
		
		System.out.println("Duplicate numbers in array");
		
		for (int i=0;i<array.length;i++) {
			
			for (int j=i+1;j<array.length;j++) {
				
				if (array[i]==array[j]) 
					
				System.out.println(array[j]);
				
				mylist.add(array[j]);
				
				//System.out.println("" + array[j]);	
			
			}
			
			
			
		//	mylist.addAll(System.out.print("array list"+array[j]));	
		}
		

	}

}
