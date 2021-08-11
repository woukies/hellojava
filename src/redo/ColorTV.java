package redo;

class TV2 {
	private int size;

	public TV2(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

public class ColorTV extends TV2 {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + this.color + "컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}
