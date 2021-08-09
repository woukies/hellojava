package redo;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = Integer.valueOf(n);
		System.out.println("intObject = " + intObject);

		intObject = n;
		System.out.println("intObject = " + intObject);

		int m = intObject + 10;
		System.out.println("m = " + m);
	}
}
