package redo;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("Spring");
		int size = list.size();
		System.out.println("총 list 갯수: " + size);

		String skill = list.get(2);
		System.out.println("2번째: " + skill);

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + ": " + s);
		}
		System.out.println();

		System.out.println("list.remove(2)");
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + ": " + s);
		}
		System.out.println();

		System.out.println("list.remove(list.get(2))");
		list.remove(list.get(2));
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + ": " + s);
		}
		System.out.println();

		System.out.println("list.remove(\"Spring\")");
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + ": " + s);
		}
	}
}
