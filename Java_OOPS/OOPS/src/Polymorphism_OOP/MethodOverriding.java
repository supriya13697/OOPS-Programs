package Polymorphism_OOP;

class Animal{
	void display() {
		System.out.println("Animal class");
	}
}
class Dog extends Animal{
	void display() {
		System.out.println("Dog is an animal");
	}
}
class Cat extends Animal{
	void display() {
		System.out.println("Cat is an animal");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Dog();
		a.display();
		
		Animal a1 = new Cat();
		a1.display();
		
	}

}
