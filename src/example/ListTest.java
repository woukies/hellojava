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
	private String[] drink = { "Ŀ��", "����", "��", "����", "����", "���ɸ�" };

	public ListTest() {
		setTitle("����Ʈ");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		listPanel = new JPanel();
		panel = new JPanel();
		list = new JList(drink);
		// ����Ʈ�� ��輱�� �����Ѵ�.
		// list.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		// ����Ʈ�� ��ũ�ѹٸ� �߰��Ѵ�.
		JScrollPane scroller = new JScrollPane(list);
		scroller.setPreferredSize(new Dimension(200, 100));

		// ����Ʈ�� ���� ��带 ���� ���� ���� ����
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListListener());

		label = new JLabel("���õ� �׸�: ");
		selected = new JTextField(10);

		// �ؽ�Ʈ �ʵ带 ���� �Ұ��� �����Ѵ�.
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
			// ���õ� ���ø� ��´�.
			String selection = (String) list.getSelectedValue(); // list.getSelectedIndex()

			// ���õ� ���ø� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			selected.setText(selection);
		}
	}

	public static void main(String[] args) {
		new ListTest();
	}
}
