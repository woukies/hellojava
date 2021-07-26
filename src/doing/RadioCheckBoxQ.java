package doing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioCheckBoxQ {

	public static void main(String[] args) {
		/*
		 * ��ȭ �帣 ����(�ڹ̵�, �׼�, ����) ���� ���� (û�ҳ� 10.0, ���� 13.0) ���� ������ û�ҳ� ��Ȱ��ȭ ����Ʈ ���� ���� �հ�
		 */

		JFrame j = new JFrame();

		String[] movies = { "�ڹ̵�", "�׼�", "����" };
		j.add(new MoviePanel(movies));
		j.setSize(1000, 1000);
		j.setVisible(true);

	}

}

class MyFrameRCB extends JFrame implements ActionListener {
	String[] movies = { "�ڹ̵�", "�׼�", "����" };

	public MyFrameRCB() {

	}

	public void actionPerformed(ActionEvent e) {
	}
}

class MoviePanel extends JPanel implements ActionListener, ItemListener {
	private JRadioButton[] radioButton;
	private JPanel radioPanel;
	private JLabel radioResult;

	public MoviePanel() {
	}

	public MoviePanel(String[] s) {
		radioButton = new JRadioButton[s.length];
		radioPanel = new JPanel();

		ButtonGroup radioSize = new ButtonGroup();

		for (int i = 0; i < s.length; i++) {
			radioButton[i] = new JRadioButton(s[i]);
			radioButton[i].addActionListener(this);
			radioSize.add(radioButton[i]);
			radioPanel.add(radioButton[i]);
		}

		add(radioPanel, BorderLayout.CENTER);
		radioResult = new JLabel("no movie");

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (JRadioButton r : radioButton) {
			if (e.getSource() == r) {
				radioResult.setText("2");
			}
		}
		if (e.getSource() != null) {

		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}

class DessertPanel extends JPanel {

}
