package doing;

public class Compare {

	public static void main(String[] args) {
		int num0 = 2;
		int num1 = 2;
		int num2 = 0;

		String string0 = "dog";
		String string1 = "cat";
		String string2 = "dog";
		String string3 = new String("dog");
		String string4 = new String("dog");

		System.out.printf("%d == %d -> %s\n", num0, num1, num0 == num1 ? "true" : "false");
		System.out.printf("%d == %d -> %s\n", num0, num2, num0 == num2 ? "true" : "false");
		System.out.printf("%d == %d -> %s\n", num1, num2, num1 == num2 ? "true" : "false");

		System.out.println();

		System.out.printf("%s == %s -> %s\n", string0, string1, string0 == string1 ? "true" : "false");
		System.out.printf("%s == %s -> %s\n", string0, string2, string0 == string2 ? "true" : "false");
		System.out.printf("%s == %s -> %s\n", string0, string3, string0 == string3 ? "true" : "false");
		System.out.printf("%s == %s -> %s\n", string3, string4, string3 == string4 ? "true" : "false");
		System.out.printf("%s == %s -> %s\n", string0, string3, string0.equals(string3) ? "true" : "false");
		System.out.printf("%s == %s -> %s\n", string3, string4, string3.equals(string4) ? "true" : "false");

	}

}
