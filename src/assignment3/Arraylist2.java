package assignment3;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Cities in Maharashtra");
		
		ArrayList<String> CitiesinMaharashtra = new ArrayList<String>();
	    CitiesinMaharashtra.add("Mumbai");
	    CitiesinMaharashtra.add("Pune");
	    CitiesinMaharashtra.add("Nagpur");
	    CitiesinMaharashtra.add("Nashik");
	    CitiesinMaharashtra.add("Kolhapur");
	    
	    for (String i : CitiesinMaharashtra) {
	    	
	      System.out.println(i);
	    }
	    
    	System.out.println("Cities in MP");

	ArrayList<String> CitiesinMP = new ArrayList<String>();
	   
	          
	         CitiesinMP.add("Indore");
	         CitiesinMP.add("Ujjain");
	         CitiesinMP.add("Bhopal");
	         
	         for (String j :CitiesinMP) {
	        	 
	        	 System.out.println(j);
	         }
	         
		    	System.out.println("Cities in India");

	         ArrayList<String>CitiesIndia =new ArrayList<String>();
	
	           CitiesIndia.addAll(CitiesinMaharashtra);
	           CitiesIndia.addAll(CitiesinMP);
	    for (String k:CitiesIndia) {
	   
		         System.out.println(k);
		         
	    }
	}

}
