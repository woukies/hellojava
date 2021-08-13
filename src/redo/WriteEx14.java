package redo;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./res/output2.txt");
		String data = "안녕 자바 프로그램";

		writer.write(data, 3, 2);

		writer.close();
	}
}
