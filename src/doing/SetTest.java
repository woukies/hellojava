package doing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		HashSet<String> hashSet = new HashSet<>();

		linkedHashSet.add("아이스크림");
		linkedHashSet.add("커피");
		linkedHashSet.add("초콜릿");
		linkedHashSet.add("사이다");
		linkedHashSet.add("코코팜");
		linkedHashSet.add("레쓰비");
		linkedHashSet.add("우유");
		linkedHashSet.add("녹차");
		linkedHashSet.add("쿠키");
		linkedHashSet.add("코코팜"); // set은 중복 안됨

		Iterator<String> i = linkedHashSet.iterator();
		while (i.hasNext()) {
			String s = i.next();
			treeSet.add(s);
			hashSet.add(s);
		}

		System.out.println("LinkedHashSet(" + linkedHashSet.size() + "): " + linkedHashSet); // 입력 순서
		System.out.println("TreeSet(" + treeSet.size() + "): " + treeSet); // 가나다 순서
		System.out.println("HashSet(" + hashSet.size() + "): " + hashSet); // 일정하지 않은 순서지만 빠름

		Set<String> set1, set2, set3;

		set1 = new HashSet<>();
		set2 = new HashSet<>();
		set3 = new HashSet<>();

		set1.add("가");
		set1.add("나");
		set1.add("다");
		set1.add("라");
		set1.add("마");

		set2.add("가");
		set2.add("라");
		set2.add("마");

		set3.add("나");
		set3.add("하");
		set3.add("차");
		set3.add("마");
		set3.add("사");

		System.out.println();
		System.out.printf("%s.containsAll(%s): %s\n", set1, set2, set1.containsAll(set2));
		System.out.printf("%s.containsAll(%s): %s\n", set1, set3, set1.containsAll(set3));
		System.out.printf("%s.containsAll(%s): %s\n", set2, set3, set2.containsAll(set3));

		System.out.println();
		System.out.printf("%s.addAll(%s): %s\n", set1, set3, set1.addAll(set3));

		System.out.println();
		System.out.printf("%s.retainAll(%s): %s\n", set1, set2, set1.retainAll(set2));
		System.out.printf("%s.retainAll(%s): %s\n", set1, set3, set1.retainAll(set3));
		System.out.printf("%s.retainAll(%s): %s\n", set2, set3, set2.retainAll(set3));
		
		System.out.println();
		System.out.printf("%s.removeAll(%s): %s\n", set1, set2, set1.removeAll(set2));
		System.out.printf("%s.removeAll(%s): %s\n", set1, set3, set1.removeAll(set3));
		System.out.printf("%s.removeAll(%s): %s\n", set2, set3, set2.removeAll(set3));
		
	}

}
