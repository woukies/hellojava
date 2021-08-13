package redo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("./res/output.txt");
				
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		
//		os.flush();
		os.close();
	}
}
