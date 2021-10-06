package assignment1;

public class Maximumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 78, 90, 4, 36, 8, 7};
		
		 int max=arr[0];
		 
		 for (int i=0;i<arr.length;i++)		
		 {
		        if (arr[i]>max)			  
	
				  max=arr[i]; 		 		
           }
			
			System.out.println(" maximum number in array is:" +max);
			
			
			int min =arr[0];
			
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]<min)
					
					min =arr[i];
				
			}
			
			System.out.println(" minimum number in array is:" +min);


			int sum=0;
			for (int i=0;i<arr.length;i++)
			{
				
				sum=sum+arr[i];
			}
			System.out.println("sum of elements in array::"+sum);
			
			int evensum=0;
			int oddsum=0;
			
			for (int i=0;i<arr.length;i++) {
				
				if(arr[i] %2==0)
				{
					evensum=evensum+arr[i];
				}
				
				else
				{
					
					oddsum=oddsum+arr[i];
				}
			}
			System.out.println("the sum of even numbers in array :"+evensum);
			
			System.out.println("the summ of odd number in array is:"+oddsum);
			
			
			
			
	}
	}


