package doing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioCheckBoxQ {

	public static void main(String[] args) {
		/*
		 * 영화 장르 선택(코미디, 액션, 성인) 나이 선택 (청소년 10.0, 성인 13.0) 성인 종류면 청소년 비활성화 디저트 선택 가격 합계
		 */

		JFrame j = new JFrame();

		String[] movies = { "코미디", "액션", "성인" };
		j.add(new MoviePanel(movies));
		j.setSize(1000, 1000);
		j.setVisible(true);

	}

}

class MyFrameRCB extends JFrame implements ActionListener {
	String[] movies = { "코미디", "액션", "성인" };

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
