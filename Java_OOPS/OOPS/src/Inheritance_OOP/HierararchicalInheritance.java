package Inheritance_OOP;
class Marks2{
	void Results() {
	    System.out.println("Students MarkList");
	}
}

class Student3 extends Marks2{
	void Results2() {
	    System.out.println("View Student1 Marks");
	}
}

class Student4 extends Marks2{
	void Results3() {
	    System.out.println("View Student2 Marks");
	}
}

public class HierararchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student4 stu = new Student4();
        HierararchicalInheritance s=new HierararchicalInheritance();
        
        stu.Results3();
        stu.Results();
        
        Student3 stu1 = new Student3();
        stu1.Results2();
        stu1.Results();
        
	}

}