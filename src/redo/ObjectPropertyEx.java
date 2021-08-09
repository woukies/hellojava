package redo;

class Point3 {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void print(Object o) {
		System.out.println(o.getClass().getName());
		System.out.println(Integer.toHexString(o.hashCode()));
		System.out.println(o);
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		Point3 p = new Point3(2, 3);

		print(p);
	}
}
