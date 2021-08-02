package redo;

class CalculatorStatic {
	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}

public class CalcEx {

	public static void main(String[] args) {
		System.out.println(CalculatorStatic.abs(-2));
		System.out.println(CalculatorStatic.max(10, 6));
		System.out.println(CalculatorStatic.min(3, 1));
	}

}
