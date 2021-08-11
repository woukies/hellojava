package redo;

public class TVClass {
	private String manufacturer;
	private int year;
	private int size;

	TVClass(String manufacturer, int year, int inch) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = inch;
	}

	void show() {
		System.out.print(this.manufacturer + "에서 만든 ");
		System.out.print(this.year + "년형 ");
		System.out.println(this.size + "인치 TV");
	}

	public static void main(String[] args) {
		TVClass myTV = new TVClass("LG", 2017, 32);
		myTV.show();
	}

}
