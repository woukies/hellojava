package redo;

interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print(" --- 다시 그립니다. ");
		draw();
	}
}

class Circle4 implements Shape {
	private int radius;

	public Circle4(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

}

class Rect2 implements Shape {
	private int width, height;

	public Rect2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}

class Oval extends Rect2 {
	public Oval(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println(getWidth() + "x" + getHeight() + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return PI * getWidth() * getHeight();
	}

}

public class Shapes {
	public static void main(String[] args) {
//		Shape donut = new Circle4(10);
//		donut.redraw();
//		System.out.println("면적은 " + donut.getArea());

		Shape[] list = new Shape[3];
		list[0] = new Circle4(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect2(10, 40);

		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}
}
