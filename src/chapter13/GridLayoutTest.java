package chapter13;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {

	public static void main(String[] args) {

		MyFrame3 f = new MyFrame3();

	}

}

class MyFrame3 extends JFrame {
	public MyFrame3() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 2, 2)); // �ʰ��� �� ����
		setSize(600, 300);

		add(new JButton("��ư1"));
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		add(new JButton("��ư5"));
		add(new JButton("��ư6"));
		add(new JButton("��ư7"));
		add(new JButton("��ư8"));
		add(new JButton("��ư9"));

		//pack(); // p316
		setVisible(true);
	}
}