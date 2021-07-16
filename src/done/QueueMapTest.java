package done;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMapTest {

	public static void main(String[] args) {
		System.out.println("> Open Queue");
		int time = 10;
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = time; i >= 0; i--) {
			queue.add(i);
			System.out.println(queue + " +" + queue.toArray()[time - i]);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}

		while (!queue.isEmpty()) {
			System.out.println(queue + " -" + queue.remove());
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}

		System.out.println("> Close Queue");
		System.out.println();

		System.out.println("> Open PriorityQueue");
		String[] aString = { "banana", "coffee", "apple", "chocolate", "grape", "chicken", "peach", "cake", "milk",
				"meat" };
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		for (String s : aString) {
			pQueue.add(s);
			System.out.printf("%s ", s);
		}
		System.out.println();

		System.out.println(pQueue);

		while (!pQueue.isEmpty()) {
			System.out.println(pQueue + " -" + pQueue.remove());
		}

		System.out.println();

		PriorityQueue<String> rQueue = new PriorityQueue<String>(Collections.reverseOrder());
		for (String s : aString) {
			rQueue.add(s);
			System.out.printf("%s ", s);
		}
		System.out.println();

		System.out.println(rQueue);

		while (!rQueue.isEmpty()) {
			System.out.println(rQueue + " -" + rQueue.remove());
		}

		System.out.println("> Close PriorityQueue");

		System.out.println();

		System.out.println("> Open Map");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : aString) {
			String char2String = String.valueOf(s.charAt(0));
			Integer count = map.get(char2String);
			map.put(char2String, (count == null) ? 1 : count + 1);
			System.out.print(char2String + " ");
		}
		System.out.println();

		System.out.println("Map[" + map.size() + "]: " + map);

		System.out.println("> Close Map");
	}
}
