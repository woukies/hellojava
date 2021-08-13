package redo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("./res/output.txt");

		byte[] data = "DEFGHIJKLMN".getBytes();

		os.write(data, 1, 2);

		os.close();
	}
}
