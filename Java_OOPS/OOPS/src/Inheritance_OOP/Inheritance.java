package Inheritance_OOP;
class TestInheritance{
    public int age = 23;
	protected String name = "supriya";
}

public class Inheritance extends TestInheritance{
	int age = 20;
	float sal = 10000;
	public static void main(String[] args) {
	
	Inheritance i = new Inheritance();
	
	System.out.println(i.age);
	System.out.println(i.name);
	System.out.println(i.sal);
	}
}
