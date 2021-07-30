package redo;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alphabet;

		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		alphabet = scanner.next().charAt(0);
		
		for (char c1 = alphabet; c1 >= 'a'; c1--) {
			for (char c2 = 'a'; c2 <= c1; c2++) {
				System.out.print(c2);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
