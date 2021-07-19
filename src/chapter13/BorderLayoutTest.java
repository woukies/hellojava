package chapter13;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

	public static void main(String[] args) {

		MyFrame2 f = new MyFrame2();

	}

}

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(2, 2));
		//setSize(500,700);

		add(new JButton("(CENTER)CENTER"), BorderLayout.CENTER);
		add(new JButton("(NORTH)PAGE_START"), BorderLayout.NORTH);
		add(new JButton("(SOUTH)PAGE_END"), BorderLayout.SOUTH);
		add(new JButton("(EAST)LINE_START"), BorderLayout.LINE_START);
		add(new JButton("(WEST)LINE_END"), BorderLayout.LINE_END);

		pack(); // p316
		setVisible(true);
	}
}