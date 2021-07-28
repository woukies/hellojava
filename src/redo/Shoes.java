package redo;

enum Type {
	UPPERCASE, 한글, lowercase, ㄱㄴㄷ, ㅏㅑㅓㅕ
}

public class Shoes {

	public static void main(String[] qrgs) {
		for (Type t : Type.values()) {
			System.out.println(t);
		}
	}
}
