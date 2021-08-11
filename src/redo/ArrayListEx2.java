package redo;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();

		boolean isAdded = array.add("oracle");
		System.out.println(isAdded);
		isAdded = array.add("oracle");
		System.out.println(isAdded);
		
		array.add("ms-sql");
		array.add("my-sql");
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(i + ": " + s);
		}
	}
}
