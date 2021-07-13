import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class arrayTest {

	final static int sizeMAX = 40;

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

class MyFrame extends JFrame implements ActionListener {
	JPanel panel1, panel2;
	JLabel label;
	JButton button1, button2;
	JLabel[] labels;
	int index = 0;
	String[] string = { "¸¼À½", "ºñ", "Èå¸²", "´«" };

	MyFrame() {
		setTitle("¶óº§");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);

		panel1 = new JPanel();
		label = new JLabel("¶óº§");
		button1 = new JButton("¹öÆ°1");
		button1.addActionListener(this);
		button1.setFocusPainted(false);
		button2 = new JButton("¹öÆ°2");
		button2.addActionListener(this);
		button2.setFocusPainted(false);
		panel1.add(label);
		panel1.add(button1);
		panel1.add(button2);
		panel1.setBackground(Color.GRAY);
		add(panel1, BorderLayout.NORTH);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 4, 2, 2));

		labels = new JLabel[arrayTest.sizeMAX];
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
