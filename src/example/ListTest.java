package example;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
import java.awt.*;

public class ListTest extends JFrame {

	private JLabel label;
	private JTextField selected;
	private JPanel panel, listPanel;
	private JList list;
	private String[] drink = { "커피", "우유", "물", "소주", "맥주", "막걸리" };

	public ListTest() {
		setTitle("리스트");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		listPanel = new JPanel();
		panel = new JPanel();
		list = new JList(drink);
		// 리스트에 경계선을 설정한다.
		// list.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		// 리스트에 스크롤바를 추가한다.
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(200, 100));

		// 리스트의 선택 모드를 단일 선택 모드로 변경
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListListener());

		label = new JLabel("선택된 항목: ");
		selected = new JTextField(10);

		// 텍스트 필드를 편집 불가로 설정한다.
		selected.setEditable(false);

		listPanel.add(scroller);
		panel.add(label);
		panel.add(selected);
		add(listPanel, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
	}

	private class ListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			// 선택된 도시를 얻는다.
			String selection = (String) list.getSelectedValue(); // list.getSelectedIndex()

			// 선택된 도시를 텍스트 필드에 기록한다.
			selected.setText(selection);
		}
	}

	public static void main(String[] args) {
		new ListTest();
	}
}
