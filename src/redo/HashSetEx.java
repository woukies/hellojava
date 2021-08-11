package redo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA {
	int aa = 11;
	String bb = "azaz";
}

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<Object> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 불가
		set.add("myBatis");
//		AA a = new AA();
//		set.add(a);

		System.out.println("총 객체 수: " + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("myBatis");
		System.out.println("총 객체 수: " + set.size());

		for (String string : set) {
			System.out.println("\t" + string);
		}

		if (set.isEmpty()) {
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}

		set.clear();

		if (set.isEmpty()) {
			System.out.println("비어 있음");
		} else {
			System.out.println("객체 있음");
		}
	}
}