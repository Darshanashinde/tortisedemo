package package1;

//import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       int arr[]=new int[100];
       
		int a=100;
		
		System.out.println("reverse numbers");
		
		 for (int i=arr.length-1;i>=0;i--) {
			 
			 arr[i]=a--;
			 //System.out.println("reverse numbers");
			 System.out.println(+a);
			 
		 }
	}
}
		