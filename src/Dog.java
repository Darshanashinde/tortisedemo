
public class Dog extends Animal {

	void bark() {
		
		System.out.println("Dog is barking");
	}
	
	
	void eat() {
		
		
		System.out.println("Dog is eating ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Animal a=new Dog();
		 
		Dog d=(Dog)a;
		
	     d.bark();
		a.eat();
	}

}
