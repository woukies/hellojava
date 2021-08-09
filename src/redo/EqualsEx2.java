package redo;

class Rect {
	int width;
	int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect) obj;
		return (r.height * r.width) == (this.width * this.height);
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);

		System.out.println("a is " + (a.equals(b) ? "equal" : "not equal") + " to b");
		System.out.println("a is " + (a.equals(c) ? "equal" : "not equal") + " to c");
		System.out.println("b is " + (b.equals(c) ? "equal" : "not equal") + " to c");
	}
}
