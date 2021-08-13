package redo;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("./res/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";

		while ((readByteNo = is.read(readBytes)) != -1) {
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);

		is.close();
	}
}
