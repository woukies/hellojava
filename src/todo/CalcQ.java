package todo;

import java.util.Scanner;

abstract class CalcAB {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends CalcAB {
	@Override
	int calculate() {
		return super.a + super.b;
	}
}

class Sub extends CalcAB {
	@Override
	int calculate() {
		return super.a - super.b;
	}
}

class Mul extends CalcAB {
	@Override
	int calculate() {
		return super.a * super.b;
	}
}

class Div extends CalcAB {
	@Override
	int calculate() {
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

public class CalcQ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		char o;
		CalcAB calc;

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
		default:
			calc = new Add();
			break;
			
			// todo: 잘못된 연산자
		}

		calc.setValue(a, b);
		System.out.println(calc.calculate());

		scanner.close();
	}
}
