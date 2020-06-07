package Inheritance_OOP;
class Marks{
	void Results() {
	    System.out.println("Parent Class Results");
	}
	void Test() {
		System.out.println("Parent Class");
	}
}

class Student extends Marks{
	void Results() {
	    System.out.println("Child Class Results");
	}
	void abc() {
		System.out.println("Child Class");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Marks m = new Student();
		m.Results();
		m.Test();
		
		//Upcating
//		Marks m = new Student();
//		Student s = (Student)m;
//		s.abc();
		
		Student s = new Student();
		s.Results();
		s.Test();
		s.abc();
	}

}
