package assignment4;

class Box{
	int size;
	Box(int s) { size =s ;}
	
}

public class Laser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Box b1 = new Box(5);
  Box[] ba =go (b1,new Box(6));
  ba[0]=b1;
  for (Box b :ba) 
	  System.out.println(b.size + " ");
	}

	static Box[] go(Box b1,Box b2) {
		
		b1.size =4;
		Box[] ma= {b1,b2};
		return ma;
		
	}
	
}
