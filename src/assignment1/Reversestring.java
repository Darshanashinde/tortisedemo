package assignment1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mystring="I am working at Neosoft Technologies Ltd";
		int length=mystring.length();
		 
		String rev="";

			for (int i=length-1;i>=0;i--)
			{
				
				rev=rev+mystring.charAt(i);
				

			}
			
			System.out.println( " reverse of "+mystring+ " is "  );
			
			System.out.println(" "+rev );
	}
	
}