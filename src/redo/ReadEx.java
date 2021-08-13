package redo;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("./res/test.txt");
		int readByte;

		while (true) {
			readByte = is.read();
			if (readByte == -1) {
				break;
			}
			
			System.out.print((char) readByte);
		}

		is.close();
	}
}
