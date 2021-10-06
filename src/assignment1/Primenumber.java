package assignment1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[]{1,7,20,7,15,31,48};
		//int a=7;
		int b=0;
		for (int i=2;i<=a.length-1;i++) {
			
			if (a[i]%2==0) {
			    
				
				System.out.println("prime number :"+a[i]);
				
			}
			else {
				
				//for(i=2;i<=a.length-1;i++) {
					//if(a[i]%2==0)
				
				System.out.println(" not a prime number:"+a[i]);
			}
		}	
			
		}
    
}

