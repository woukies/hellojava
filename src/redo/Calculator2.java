package redo;

import java.util.Scanner;

abstract class Calc2 {
	protected int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calculate();
}

class Add extends Calc2 {
	@Override
	public int calculate() {
		return super.a + super.b;
	}
}

class Sub extends Calc2 {
	@Override
	public int calculate() {
		return super.a - super.b;
	}
}

class Mul extends Calc2 {
	@Override
	public int calculate() {
		return super.a * super.b;
	}
}

class Div extends Calc2 {
	@Override
	public int calculate() {
		int res;
		try {
			res = super.a / super.b;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			res = 0;
		}
		return res;
	}
}

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		char o;
		Calc2 calc;

		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		o = scanner.next().charAt(0);

		switch (o) {
		case '-':
			calc = new Sub();
			break;
		case '*':
			calc = new Mul();
			break;
		case '/':
			calc = new Div();
			break;
		case '+':
			calc = new Add();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			scanner.close();
			return;			
		}

		calc.setValue(a, b);
		System.out.println(calc.calculate());
		// calc instanceof Div

		scanner.close();
	}
}
