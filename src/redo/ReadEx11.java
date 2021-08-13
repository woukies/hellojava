package redo;

import java.io.FileReader;
import java.io.Reader;

public class ReadEx11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./res/test2.txt");
		int readData;

		while ((readData = reader.read()) != -1) {
			System.out.print((char)readData);
		}
		
		reader.close();
	}
}
