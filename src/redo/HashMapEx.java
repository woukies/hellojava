package redo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); // upcasting

		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이찬원", 25);

		System.out.println("총 Entry 수: " + map.size());

		Set<String> keySet = map.keySet();

		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key); // int = Integer (Unboxing)
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		map.remove("임영웅");
		System.out.println("총 Entry 수: " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // { key: value }
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
