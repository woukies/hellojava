package redo;

class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

class ColorPoint extends Point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint c = new ColorPoint();
		c.set(3, 4);
		c.setColor("BLUE");
		c.showPoint();
		c.showColorPoint();
		
		Point cp = new ColorPoint();
		cp.set(5, 6);
		//cp.showColorPoint(); //error
	}

}
