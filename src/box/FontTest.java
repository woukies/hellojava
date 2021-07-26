package box;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyPanel3 extends JPanel {

	Font f1, f2, f3, f4, f5;

	public MyPanel3() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monospaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD & Font.ITALIC, 20);
		f5 = new Font("DialogInput", Font.BOLD, 20);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("Serif 20 points PLAIN", 10, 50);
		g.setFont(f2);
		g.drawString("SanSerif 20 points BOLD", 10, 70);
		g.setFont(f3);
		g.drawString("Monospaced 20 points ITALIC", 10, 90);
		g.setFont(f4);
		g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
		g.setFont(f5);
		g.drawString("DialogInput 20 points BOLD", 10, 130);
	}
}

public class FontTest extends JFrame {
	public FontTest() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Font Test");
		JPanel panel = new MyPanelMouse();
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		FontTest s = new FontTest();
	}
}