package helloWorld;

public class Array2DTest {

	public static void main(String[] args) {
		String[][] words = { 
				{ "chair", "의자" }, 
				{ "computer", "컴퓨터" }, 
				{ "integer", "정수" }
		};

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				System.out.printf("%s ", words[i][j]);
			}
			System.out.println();
		}

		for (String[] word : words) {
			for (String w : word) {
				System.out.printf("%s ", w);
			}
			System.out.println();
		}

		System.out.println("> exit");
	}

}
