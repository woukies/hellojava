package redo;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		System.out.println("양수 10개를 입력하세요.");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("가장 작은 수는 " + min + "이고,");
		System.out.println("가장 큰 수는 " + max + "이고,");
		System.out.println("최소값+최대값은 " + (min + max) + "입니다.");
		scanner.close();
	}
}
