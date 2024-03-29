package done;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayTest {

	final static int sizeMAX = 40;

	public static void main(String[] args) {
		new ArrayFrame();
	}
}

class ArrayFrame extends JFrame implements ActionListener {
	JPanel panel1, panel2;
	JLabel label;
	JButton button1, button2;
	JLabel[] labels;
	int index = 0;
	String[] string = { "맑음", "비", "흐림", "눈" };

	ArrayFrame() {
		setTitle("라벨");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);

		panel1 = new JPanel();
		label = new JLabel("라벨");
		button1 = new JButton("버튼1");
		button1.addActionListener(this);
		button1.setFocusPainted(false);
		button2 = new JButton("버튼2");
		button2.addActionListener(this);
		button2.setFocusPainted(false);
		panel1.add(label);
		panel1.add(button1);
		panel1.add(button2);
		panel1.setBackground(Color.GRAY);
		add(panel1, BorderLayout.NORTH);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 4, 2, 2));

		labels = new JLabel[ArrayTest.sizeMAX];
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setOpaque(true);
			panel2.add(labels[i]);
		}

		add(panel2, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			System.out.println(index);
			labels[(index % labels.length)].setText(string[(int) ((index / labels.length) % string.length)]);
			labels[(index % labels.length)].setBackground(new Color((int) (Math.random() * 100) + 150,
					(int) (Math.random() * 100) + 150, (int) (Math.random() * 100) + 150));
			index++;
		}
		if (e.getSource() == button2) {
			for (int i = 0; i < labels.length; i++) {
				int color = (int) (Math.random() * 255);
				labels[i].setText(Integer.toString(color));
				labels[i].setBackground(new Color(color, 255, color));
			}
		}
	}
}
