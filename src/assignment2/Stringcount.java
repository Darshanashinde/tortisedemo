package assignment2;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = ("I am working at Neosoft. Neosoft Technologies Ltd is a CMM level 5 "
				+ "company. Neosoft has offices in Mumbai, pune and Noida. It is a service based company.");

		
     String[] a= myString.split(" ");
     
     int neocount=0;
  
    for(int i =0;i<a.length;i++) {
    	 
    	
    	//System.out.println(neocount); 
    	
    	if(a[i].contains("Neosoft")) {
    
    	neocount++;
    	}
    	
     }
     
    System.out.println(neocount);

    // System.out.println("The length of the mystring =" +length);
     
     
     
	}
	
	

}
