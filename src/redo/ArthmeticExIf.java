package redo;

import java.util.Scanner;

public class ArthmeticExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, result = 0;
		String operand;

		System.out.print("����>>");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				
				scanner.close();
				return;
			}
			result = a / b;
		} else {
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�.");
			
			scanner.close();
			return;
		}

		System.out.printf("%d%s%d�� ��� ����� %d\n", a, operand, b, result);

		scanner.close();
	}

}
