package redo;

class Point4 {
	private int x, y;

	public Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point4 p = new Point4(2, 3);

		System.out.println(p);
		System.out.println(p + "입니다");
		System.out.println(p.toString());
	}
}
