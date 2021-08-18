package redo;

class ColorPointTwo extends ColorPoint3 {
	public ColorPointTwo() {
		super(0, 0, "BLACK");
	}

	public ColorPointTwo(int x, int y) {
		super(x, y, "BLACK");
	}
}

public class PointTwo {
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
