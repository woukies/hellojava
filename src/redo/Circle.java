package redo;

public class Circle {
	int radius;
	String name;

	public Circle() {

	}

	public double getAread() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		double area;
		
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		area = pizza.getAread();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getAread();
		System.out.println(pizza.name + "의 면적은 " + area);
	}
}
