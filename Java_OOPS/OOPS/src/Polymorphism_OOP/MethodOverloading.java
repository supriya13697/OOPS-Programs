package Polymorphism_OOP;


class Mathematics{
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	int sum(int a,int b, int c, int d) {
		return a+b+c+d;
	}
}
	

public class MethodOverloading {
	public static void main(String args[]) {
        Mathematics m = new Mathematics();
        System.out.println(Mathematics.sum(1, 2));
        System.out.println(m.sum(2, 3, 4));
        System.out.println(m.sum(3, 4, 5, 6));
	}
}
