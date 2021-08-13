package redo;

class Circle2 {
	private int x, y, radius;

	public Circle2(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle2 c = (Circle2) obj;
		return (c.x == this.x) && (c.y == this.y);
	}

	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ") 반지름" + radius;
	}
}

public class CircleApp {
	public static void main(String[] args) {
		Circle2 a = new Circle2(2, 3, 5);
		Circle2 b = new Circle2(2, 3, 30);
		System.out.println("원 a: " + a);
		System.out.println("원 b: " + b);
		if (a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("서로 다른 원");
		}
	}
}
