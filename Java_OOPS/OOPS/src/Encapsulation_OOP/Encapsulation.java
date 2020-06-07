package Encapsulation_OOP;
class Stu{
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Stu t = new Stu();
		
		t.setAge(28);
        t.setName("Supriya");
        
        System.out.println("Age: "+t.getAge() +" Name: " +t.getName() );
	}
}
