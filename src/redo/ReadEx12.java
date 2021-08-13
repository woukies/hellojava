package redo;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx12 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./res/test2.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";

		while ((readCharNo = reader.read(cbuf)) != -1) {
			data += new String(cbuf, 0, readCharNo);
		}

		System.out.print(data);

		reader.close();
	}
}
