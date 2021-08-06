package todo;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Tri extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // 동적 바인딩: Shape s = line;
		paint(new Rect());
		paint(new Shape());

		Shape shape = new Tri();
		paint(shape);
		Shape shape2 = new Shape();
		Rect rect = (Rect) shape2; // error
		paint(rect);
		Shape shape3 = new Rect();
		Rect rect2 = (Rect) shape3;
		paint(shape3);
		paint(rect2);
	}
}
