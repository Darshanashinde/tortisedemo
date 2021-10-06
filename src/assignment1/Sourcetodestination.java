package assignment1;

public class Sourcetodestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] s = {1, 2, 3, 4, 5, 6};
		int [] d = new int[6];
		
		
		  
		  for (int i=0;i<s.length;i++)
		  {
		   d[i]=s[i];
		   
		   d[0]++;
			   
		  }
		   System.out.println(" numbers in source" );
		 
		   for (int i=0;i<s.length; i++)
		   {
		   
         System.out.println(s[i] +  " ");
         
	      }
		  
		  System.out.println("numbers in destination");
		  
       for (int i=0;i<d.length; i++) 
         {
		  
    	   System.out.println(d[i] + " ");
    	   
          
         }	  

}
}
