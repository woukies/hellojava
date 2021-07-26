package redo;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}

		if (num[2] == 0) {
			System.out.println("삼각형의 넓이는 " + (num[0] * num[1]) / 2.0);
		} else {
			System.out.println("사다리꼴의 넓이는 " + (num[0] + num[1]) * num[2] / 2.0);
		}

		scanner.close();
	}

}
