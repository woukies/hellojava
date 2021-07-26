package redo;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c;

		System.out.print("정수 3개 입력>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		int max, min;

//		if (a > b && b > c) {
//			max = a;
//			min = c;
//		} else if (a > c && c > b) {
//			max = a;
//			min = b;
//		} else if (b > a && a > c) {
//			max = b;
//			min = c;
//		} else if (b > c && c > a) {
//			max = b;
//			min = a;
//		} else if (c > a && a > b) {
//			max = c;
//			min = b;
//		} else {
//			max = c;
//			min = a;
//		}

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}

		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);

		scanner.close();
	}

}
