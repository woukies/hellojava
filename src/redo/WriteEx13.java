package redo;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./res/output2.txt");

		char[] data = "임영웅".toCharArray();

		writer.write(data, 1, 2);

		writer.close();
	}
}
