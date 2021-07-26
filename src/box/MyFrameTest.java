package box;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrameTest {

	public static void main(String[] args) {
		new FrameTestFrame();
	}

}

class FrameTestFrame extends JFrame {
	public FrameTestFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		setSize(screenSize.width / 3, screenSize.height / 3);
		setLocation((screenSize.width / 2) - ((screenSize.width / 3) / 2),
				(screenSize.height / 2) - ((screenSize.height / 3) / 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame Test 5");
		setLayout(new FlowLayout());

		JLabel label = new JLabel();
		label.setText("Hello, World");
		MyButton button1 = new MyButton();
		MyButton button2 = new MyButton();
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton();
		button1.setText("버튼1");
		button2.setText("버튼2");
		button4.setText("버튼4");
		button2.setEnabled(false);

		JPanel panel = new JPanel();
		JTextField textfield1 = new JTextField(10);
		JTextField textfield2 = new JTextField(10);

		panel.add(textfield1);
		panel.add(textfield2);

		this.add(label);
		this.add(button2);
		this.add(button1);
		this.add(button3);
		this.add(panel);
		this.add(button4);

		setVisible(true);
	}
}

class MyButton extends JButton {
	public MyButton() {
		setRolloverEnabled(false);
	}
}
