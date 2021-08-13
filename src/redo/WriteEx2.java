package redo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("./res/output.txt");

		byte[] data = "DEF".getBytes();

		os.write(data);

		os.close();
	}
}
