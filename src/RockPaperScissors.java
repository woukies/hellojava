import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user;

		while (true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
			System.out.print("가위 바위 보! >> ");
			user = scanner.next();
			if (user.equals("그만")) {
				break;
			}
			game(user);
		}

		System.out.println("게임을 종료합니다...");
		scanner.close();
	}

	public static void game(String user) {
		final String[] rps = { "가위", "바위", "보" };
		String com = rps[(int) (Math.random() * 3)];
		StringBuffer result = new StringBuffer();

		result.append("사용자 = ");
		result.append(user);
		result.append(", ");
		result.append("컴퓨터 = ");
		result.append(com);
		result.append(", ");

		if (user.equals(com)) {
			result.append("비겼습니다.");
		} else {
			switch (user) {
			case "가위":
				if (com.equals("보")) {
					result.append("사용자가 이겼습니다.");
				} else {
					result.append("컴퓨터가 이겼습니다.");
				}
				break;
			case "바위":
				if (com.equals("가위")) {
					result.append("사용자가 이겼습니다.");
				} else {
					result.append("컴퓨터가 이겼습니다.");
				}
				break;
			case "보":
				if (com.equals("바위")) {
					result.append("사용자가 이겼습니다.");
				} else {
					result.append("컴퓨터가 이겼습니다.");
				}
				break;
			default:
				result.append("잘못된 입력입니다.");
			}
		}
		System.out.println(result);
	}
}
