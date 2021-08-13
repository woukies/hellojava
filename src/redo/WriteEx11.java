package redo;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx11 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./res/output2.txt");

		char[] data = "홍길동".toCharArray();

		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}

		writer.close();
	}
}
