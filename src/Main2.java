
public class Main2 {

	  // Create a fullThrottle() method

	public static void fullThrottle() {
		
		System.out.println("the car is going as fast as can >>");
		
	}
	  // Create a speed() method and add a parameter

	public static void speed(int maxspeed) {
		
		System.out.println("maxixmun Speed of the car " + maxspeed);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Inside main, call the methods on the myCar object


		Main2 MyCar = new Main2();
		
		MyCar.fullThrottle();
		MyCar.speed(200);
	}

}
