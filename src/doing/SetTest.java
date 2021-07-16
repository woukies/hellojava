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

		linkedHashSet.add("���̽�ũ��");
		linkedHashSet.add("Ŀ��");
		linkedHashSet.add("���ݸ�");
		linkedHashSet.add("���̴�");
		linkedHashSet.add("������");
		linkedHashSet.add("������");
		linkedHashSet.add("����");
		linkedHashSet.add("����");
		linkedHashSet.add("��Ű");
		linkedHashSet.add("������"); // set�� �ߺ� �ȵ�

		Iterator<String> i = linkedHashSet.iterator();
		while (i.hasNext()) {
			String s = i.next();
			treeSet.add(s);
			hashSet.add(s);
		}

		System.out.println("LinkedHashSet(" + linkedHashSet.size() + "): " + linkedHashSet); // �Է� ����
		System.out.println("TreeSet(" + treeSet.size() + "): " + treeSet); // ������ ����
		System.out.println("HashSet(" + hashSet.size() + "): " + hashSet); // �������� ���� �������� ����

		Set<String> set1, set2, set3;

		set1 = new HashSet<>();
		set2 = new HashSet<>();
		set3 = new HashSet<>();

		set1.add("��");
		set1.add("��");
		set1.add("��");
		set1.add("��");
		set1.add("��");

		set2.add("��");
		set2.add("��");
		set2.add("��");

		set3.add("��");
		set3.add("��");
		set3.add("��");
		set3.add("��");
		set3.add("��");

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
