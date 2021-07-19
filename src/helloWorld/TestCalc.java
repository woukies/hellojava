package helloWorld;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc calc = new Calc();

		System.out.println("ют╥б: ");

		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(calc.sum(a, b));
		} catch (Exception e) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			System.out.println(calc.sum(a, b));
		}
		
		scanner.close();

	}

}

class Calc {
	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
}