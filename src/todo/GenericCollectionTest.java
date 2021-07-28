package todo;

public class GenericCollectionTest {

	public static void main(String[] args) {
		GenericTest<Integer> generic = new GenericTest<>();

		generic.set(10);
		System.out.println(generic.get());

		String[] language = { "C++", "Java", "Javascript" };

		System.out.println(ArrayClass.getLast(language)); // ArrayClass.<String>getLast(language) <> 생략 가능

	}

}

class GenericTest<something> {
	private something value;

	public void set(something v) {
		this.value = v;
	}

	public something get() {
		return this.value;
	}
}

class ArrayClass {
	public static <T> T getLast(T[] array) {
		return array[array.length - 1];
	}
}