package redo;

import java.util.Scanner;

public class ArthmeticExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, result = 0;
		String operand;

		System.out.print("연산>>");
		a = scanner.nextInt();
		operand = scanner.next();
		b = scanner.nextInt();

		if (operand.equals("+")) {
			result = a + b;
		} else if (operand.equals("-")) {
			result = a - b;
		} else if (operand.equals("*")) {
			result = a * b;
		} else if (operand.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				
				scanner.close();
				return;
			}
			result = a / b;
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
			
			scanner.close();
			return;
		}

		System.out.printf("%d%s%d의 계산 결과는 %d\n", a, operand, b, result);

		scanner.close();
	}

}
