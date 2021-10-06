package assignment1;

public class Duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] source =new int []  {90, 34, 7, 99, 10,7,34,90};
	
		System.out.println("Duplicate Numbers in array ");
		
		for (int i=0;i<source.length;i++){
			
		 for(int j=i+1;j<source.length;j++) {

		if (source[i]==source[j]) 
			
			System.out.println(source[j]);
	  }
		
		//System.out.println(source[j]);
		 }
		
		}	
		//System.out.println(source[j]);
}

