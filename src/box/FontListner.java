package box;

import java.awt.GraphicsEnvironment;

public class FontListner {

	public static void main(String[] args) {
		String[] fontList;
		GraphicsEnvironment g;
		g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontList = g.getAvailableFontFamilyNames();
		for (String s : fontList) {
			System.out.println(s);
		}

	}

}
