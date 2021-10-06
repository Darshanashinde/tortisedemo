
public class Main {

	//static method:to call static method no need of object
	
	 static void StaticMethod() {
		 System.out.println("static method ****");
		 
	 }
	
	public void publicMethod() {
		
		System.out.println("public method  ***...");
	}
	
	//publicMethod :to call public method we have to create object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StaticMethod();
		//publicMethod();--- it was showing compile error
		
		//create object of main class and call  publicmethod
		
		Main myObj = new Main();
		myObj.publicMethod();
		
	}

}
