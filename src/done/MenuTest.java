package done;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTest extends JFrame implements ActionListener, ItemListener {
	private JMenuBar menuBar;
	private JMenu menu, submenu;
	private JMenuItem menuItem1, menuItem2;
	private JMenuItem sbMenuItem1, sbMenuItem2;
	private JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	private JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;
	private JButton button;

	public MenuTest() {

		// �޴��ٸ� �����Ѵ�.
		menuBar = new JMenuBar();

		// ù��° �Ŵ��� ����
		menu = new JMenu("ù��° �޴�");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);

		// �޴� �׸���� ����
		menuItem1 = new JMenuItem("�޴� �׸� 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);

		ImageIcon icon = new ImageIcon("icon.gif");
		menuItem2 = new JMenuItem("�޴� �׸� 2", icon);
		menu.add(menuItem2);

		// ���� ��ư �޴� �׸���� �����Ͽ� �޴��� �߰�
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();

		rbMenuItem1 = new JRadioButtonMenuItem("���� ��ư �޴� �׸� 1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);

		rbMenuItem2 = new JRadioButtonMenuItem("���� ��ư �޴� �׸� 2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);

		// üũ �ڽ� �޴� �׸���� �����Ͽ� �޴��� �߰�
		menu.addSeparator();
		cbMenuItem1 = new JCheckBoxMenuItem("�Ľ� �ֹ� �׸� 1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);

		cbMenuItem2 = new JCheckBoxMenuItem("üũ �ڽ� �޴� �׸� 2");
		menu.add(cbMenuItem2);

		// ���� �޴� ����
		menu.addSeparator();
		submenu = new JMenu("���� �޴�");
		submenu.setMnemonic(KeyEvent.VK_S);

		sbMenuItem1 = new JMenuItem("���� �޴� �׸� 1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);

		sbMenuItem2 = new JMenuItem("���� �޴� �׸� 2");
		submenu.add(sbMenuItem2);
		menu.add(submenu);

		// �޴����� �ι�° ���� �ۼ��Ѵ�.
		menu = new JMenu("�ι�° �޴�");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);

		// �޴��ٸ� �����ӿ� �����Ѵ�.
		setJMenuBar(menuBar);
		
		button = new JButton("������");
		button.addActionListener(this);
		
		add(button);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "�޴� �׸� 1�� �����ϸ� �ȵ˴ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(this, "����", "���� ����", JOptionPane.PLAIN_MESSAGE, new ImageIcon("./res/lion.png"));
			button.setText("���� �Դٰ�");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbMenuItem1) {
			// üũ �ڽ� �޴� �׸� ���� ó��

			String[] dessert = { "����ũ", "���ݸ�", "���̽�ũ��", "����", "����"};
			System.out.println((String) JOptionPane.showInputDialog(this, "�Ľ��� �����ϼ���.", "�Ľ� �ֹ�", JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("./res/smile.png"), dessert, dessert[3])); // ������ �ι�°: �迭(dessert)�� �����ϸ� ����, null ������ ���� �Է�

		}
	}

	public static void main(String args[]) {
		MenuTest f = new MenuTest();
		f.setSize(500, 200);
		f.setVisible(true);
	}
}
