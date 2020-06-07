package Abstraction_OOP;
abstract class Shape{
	
	String color;
	
	abstract double area();
	abstract String prntStatement();
	
	
	Shape(String color){
		this.color = color;
	}
//concrete class	
//	String getcolor() {
//		return "White";
//	}
}

class Circle extends Shape{

double radius;
	Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	String prntStatement() {
		return "Circle colour is " +super.color + " & Area is " +area();
	}
	
	String getcolor() {
		return "Blue" ;
	}
	
}

class Rectangle extends Shape{

	double len;
	double wid;
	
	Rectangle(String color,double len,double wid) {
		super(color);
		this.len = len;
		this.wid = wid;
	}

	@Override
	double area() {
		return len * wid;
	}

	@Override
	String prntStatement() {
		return "Rectangle colour is " +super.color + " & Area is " +area();
	}
	
}
public class AbstractionAbstractClass {

	public static void main(String[] args) {
        Circle c = new Circle("Red",10);
        Rectangle r = new Rectangle("Pink",5,3);
        System.out.println(c.prntStatement());
        System.out.println(r.prntStatement());
        System.out.println(c.getcolor()); 
        
	}

}
