package assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistascdec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> numlist=new ArrayList<Integer>();
		 //List numlist1=new ArrayList();
		numlist.add(40);
		numlist.add(60);
		numlist.add(30);
		numlist.add(34);
		numlist.add(80);
		numlist.add(23);
		numlist.add(54);
		numlist.add(90);
		numlist.add(76);
		
		System.out.println(numlist);
		
		Collections.sort(numlist);
		System.out.println("Ascending order arraylist : " + numlist);
		
		
		Collections.sort(numlist,Collections.reverseOrder());
		System.out.println("decending order array: " + numlist) ;
	}

}
