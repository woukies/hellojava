package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

public class SpinnerTest extends JFrame implements ActionListener {
	JButton button;
	JSpinner spinner;
	JPanel panel, panelS;
	JLabel label;

	public SpinnerTest() {
		setTitle("스피너 테스트");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		// List Model 테스트
		String[] items = { "소설", "잡지", "전공서적", "취미" };
		SpinnerListModel listModel = new SpinnerListModel(items);
		spinner = new JSpinner(listModel);
		panel.add(spinner);

		// Number Model 테스트
		SpinnerModel numberModel = new SpinnerNumberModel(1, 0, 100, 4);
		spinner = new JSpinner(numberModel);
		panel.add(spinner);

		// Date Model 테스트
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime(); // 현재 날짜
		calendar.add(Calendar.YEAR, -50); // 현재값보다 -50년 증가
		Date start = calendar.getTime();
		calendar.add(Calendar.YEAR, 100); // 주의 +50하면 현재 날짜가 됨
		Date end = calendar.getTime();
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.YEAR);
		spinner = new JSpinner(dateModel);
		// 날짜를 편집할 수 있는 편집기를 지정한다.
		spinner.setEditor(new JSpinner.DateEditor(spinner, "yyyy년 MM월 dd일"));
		panel.add(spinner);

		button = new JButton("날짜 출력");
		button.addActionListener(this);
		panel.add(button);

		add(panel, BorderLayout.CENTER);

		panelS = new JPanel();
		label = new JLabel();
		panelS.add(label);

		add(panelS, BorderLayout.SOUTH);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy년 MM월 dd일을 선택하였습니다.");
			label.setText(formatDate.format(spinner.getValue()));
		}

	}

	public static void main(String[] args) {
		new SpinnerTest();
	}
}
