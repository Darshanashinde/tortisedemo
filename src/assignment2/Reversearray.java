package assignment2;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newstring  = "I am learning java programming.";
		
		int length=newstring.length();

	String rev="";
	
	for(int i=length-1;i>=0;i--) {
		
		rev=rev+newstring.charAt(i);
	}
	
	System.out.println(""+newstring);
	System.out.println("revevrse of string is");
	
	System.out.println(" "+rev); 
	
	}
    
}
