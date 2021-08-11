package redo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		int maxIndex = 0;

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			arrayList.add(scanner.next());
		}

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(maxIndex).length() < arrayList.get(i).length()) {
				maxIndex = i;
			}
		}

		System.out.println("가장 긴 이름은: " + arrayList.get(maxIndex));

		scanner.close();
	}
}
