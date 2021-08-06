package redo;

abstract class Calculator {
	abstract public int add(int a, int b);

	abstract public int subtract(int a, int b);

	abstract public double average(int[] a);
}

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return (double) sum / a.length;
	}

	public static void main(String[] args) {
		GoodCalc goodCalc = new GoodCalc();
		System.out.println(goodCalc.add(2, 3));
		System.out.println(goodCalc.subtract(2, 3));
		System.out.println(goodCalc.average(new int[] { 2, 3, 4 }));
	}
}
