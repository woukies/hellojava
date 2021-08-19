import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("사랑", "love");
		dictionary.put("아기", "baby");
		dictionary.put("돈", "money");
		dictionary.put("미래", "future");
		dictionary.put("희망", "hope");

		Scanner scanner = new Scanner(System.in);
		String searchWord = "";
		String resultWord = "";

		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어? ");
			searchWord = scanner.nextLine();
			if (searchWord.equals("그만")) {
				break;
			}

			resultWord = dictionary.get(searchWord);
			if (resultWord != null) {
				System.out.println(searchWord + "은(는) " + resultWord);
			} else {
				System.out.println(searchWord + "은(는) 저의 사전에 없습니다.");
			}
		}

		scanner.close();
	}
}
