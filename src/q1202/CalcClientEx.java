package q1202;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {
	public static void main(String[] args) {
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);

		try {
			socket = new Socket("localhost", 10199);
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예: 24 + 42)>> ");
				String formula = scanner.nextLine();
				try {
					out.write(formula);
					out.newLine();
					out.flush();
					if (formula.equalsIgnoreCase("bye")) {
						break;
					}
					
					int number1 = Integer.parseInt(formula.split(" ")[0]);
					String operator = formula.split(" ")[1];
					int number2 = Integer.parseInt(formula.split(" ")[2]);
					int result = 0;

					switch (operator) {
					case "+":
						result = number1 + number2;
						break;
					case "-":
						result = number1 - number2;
						break;
					case "/":
						result = number1 / number2;
						break;
					case "*":
						result = number1 * number2;
						break;
					case "%":
						result = number1 % number2;
						break;
					default:
						throw new Exception();
					}
					System.out.println("계산 결과: " + result);
				} catch (Exception e) {
					System.out.println("계산식 오류\n");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (scanner != null) {
					scanner.close();
				}
				if (out != null) {
					out.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e2) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
