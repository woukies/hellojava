package redo;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];

		System.out.print("정수 3개 입력>>");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}

		int median;
//		if (num[0] > num[1]) {
//			if (num[1] > num[2]) {
//				median = num[1];
//			} else if (num[0] > num[2]) {
//				median = num[2];
//			} else {
//				median = num[0];
//			}
//		} else { // num[1] > num[0]
//			if (num[0] > num[2]) {
//				median = num[0];
//			} else if (num[1] > num[2]) {
//				median = num[2];
//			} else {
//				median = num[1];
//			}
//		}

		if ((num[0] > num[1] && num[1] > num[2]) || (num[2] > num[1] && num[1] > num[0])) {
			median = num[1];
		} else if ((num[0] > num[2] && num[2] > num[1]) || (num[1] > num[2] && num[2] > num[0])) {
			median = num[2];
		} else {
			median = num[0];
		}

		System.out.println("중간 값은 " + median);
		
		scanner.close();
	}
}
