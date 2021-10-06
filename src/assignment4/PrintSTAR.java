package assignment4;

public class PrintSTAR {
	{
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=i;j++) {
			
			System.out.println(j);
		}
		
		for(int k=6;k<i;k--) {
			
			System.out.println("*");
		}
	}
    System.out.println();
}
}