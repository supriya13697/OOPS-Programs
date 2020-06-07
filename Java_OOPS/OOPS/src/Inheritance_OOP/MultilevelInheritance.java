package Inheritance_OOP;


class Results{
	void Maths() {
	    System.out.println("Students MarkList");
	}
}

class Student1 extends Results{
	void Maths() {
	    System.out.println("Student1 MarkList");
	}
	void Physics() {
		System.out.println("View Physics in Student1");
	}
	void Chemistry() {
	    System.out.println("View Chemistry in student1");
	}
}

class Student2 extends Student1{
	void Maths() {
	    System.out.println("Student2 MarkList");
	}
	void Physics() {
		System.out.println("View Physics in student2");
	}
	void Telugu() {
	    System.out.println("View Telugu in student2");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Results r = new Student2();
		r.Maths();

		
		Student1 s1 = new Student2();
		s1.Maths();
		s1.Physics();
		s1.Chemistry();
		
		Student2 s2 = new Student2();
		s2.Maths();
		s2.Physics();
		s2.Chemistry();
		s2.Telugu();
	
	}

}
