package redo;

import java.util.Arrays;
import java.util.Scanner;

public class IsTriangle {

	public static void main(String[] args) {
		int[] triangle = new int[3];
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개를 입력하시오>>");
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = scanner.nextInt();
		}

		/*
		 * Arrays.sort(triangle);
		 * 
		 * if ((triangle[0] + triangle[1]) > triangle[2]) { isTriangle = true; }
		 */

		if ((triangle[0] + triangle[1]) <= triangle[2] || (triangle[0] + triangle[2]) <= triangle[1]
				|| (triangle[1] + triangle[2]) <= triangle[0]) {
			System.out.println("삼각형이 안됩니다");
		} else {
			System.out.println("삼각형이 됩니다");
		}
		scanner.close();
	}

}
