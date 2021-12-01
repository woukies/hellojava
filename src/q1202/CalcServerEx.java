package q1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(10199);
			System.out.println("연결을 기다리고 있습니다......");
			socket = listener.accept();
			System.out.println("연결이 되었습니다.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 연결을 종료했습니다.");
					break;
				}
				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (listener != null) {
					listener.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e2) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
