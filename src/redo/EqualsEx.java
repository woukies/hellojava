package redo;

class Point5 {
	private int x, y;

	public Point5(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + "," + y;
	}

	@Override
	public boolean equals(Object obj) {
		Point5 p = (Point5) obj;
		return (p.x == this.x) && (p.y == this.y);
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point5 p1 = new Point5(2, 3);
		Point5 p2 = new Point5(2, 3);
		Point5 p3 = new Point5(3, 4);

		System.out.println(p1 == p2 ? "p1 == p2" : "p1 != p2");
		System.out.println(p1.equals(p2) ? "p1 is equal to p2" : "p1 is not equal to p2");
		System.out.println(p1.equals(p3) ? "p1 is equal to p3" : "p1 is not equal to p3");
	}
}
