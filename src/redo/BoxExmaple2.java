package redo;

public class BoxExmaple2 {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("Hello");
//		box2.set(10); // type error
		String greet = box2.get();
		System.out.println(greet);

		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(7);
//		int value = box3.get();
		int value = box3.get().intValue();
		System.out.println(value);
	}
}
