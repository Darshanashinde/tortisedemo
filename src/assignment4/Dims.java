package assignment4;

public class Dims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] a= {{1,2},{3,4}};
    
    int [] b=(int []) a[1];
    
    Object o1=a;
    int [][] a2=(int [][]) o1;
    
    System.out.println(b[1]);
	}

}
