package redo;

import java.io.File;
//import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {
	public static void main(String[] args) throws Exception {
		File dir = new File("./res/temp/dir");
		File[] file = new File[3];
		for (int i = 0; i < file.length; i++) {
			file[i] = new File("./res/temp/file" + i + ".txt");
		}
//		File file4 = new File(new URI("file:/D:/temp/file4.txt"));

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (int i = 0; i < file.length; i++) {
			if (!file[i].exists()) {
				file[i].createNewFile();
			}
		}

		File temp = new File("./res/temp");
		File[] contents = temp.listFiles();

		System.out.println("날짜 & 시간\t\t형태\t크기\t이름");
		System.out.println("-----------------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			System.out.print(sdf.format(new Date(contents[i].lastModified())));
			System.out.print("\t");

			if (contents[i].isDirectory()) {
				System.out.print("<DIR>");
			} else {
				System.out.print("     ");
			}
			System.out.print("\t");
			System.out.print(contents[i].length());
			System.out.print("\t");
			System.out.print(contents[i].getName());
			System.out.print("\t");
			System.out.println();
		}

	}
}
