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

		// 메뉴바를 생성한다.
		menuBar = new JMenuBar();

		// 첫번째 매뉴를 생성
		menu = new JMenu("첫번째 메뉴");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);

		// 메뉴 항목들을 생성
		menuItem1 = new JMenuItem("메뉴 항목 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);

		ImageIcon icon = new ImageIcon("icon.gif");
		menuItem2 = new JMenuItem("메뉴 항목 2", icon);
		menu.add(menuItem2);

		// 라디오 버튼 메뉴 항목들을 생성하여 메뉴에 추가
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();

		rbMenuItem1 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);

		rbMenuItem2 = new JRadioButtonMenuItem("라디오 버튼 메뉴 항목 2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);

		// 체크 박스 메뉴 항목들을 생성하여 메뉴에 추가
		menu.addSeparator();
		cbMenuItem1 = new JCheckBoxMenuItem("후식 주문 항목 1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);

		cbMenuItem2 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 2");
		menu.add(cbMenuItem2);

		// 서브 메뉴 생성
		menu.addSeparator();
		submenu = new JMenu("서브 메뉴");
		submenu.setMnemonic(KeyEvent.VK_S);

		sbMenuItem1 = new JMenuItem("서브 메뉴 항목 1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);

		sbMenuItem2 = new JMenuItem("서브 메뉴 항목 2");
		submenu.add(sbMenuItem2);
		menu.add(submenu);

		// 메뉴바의 두번째 뉴를 작성한다.
		menu = new JMenu("두번째 메뉴");
		menu.setMnemonic(KeyEvent.VK_S);
		menuBar.add(menu);

		// 메뉴바를 프레임에 부착한다.
		setJMenuBar(menuBar);
		
		button = new JButton("눌러봐");
		button.addActionListener(this);
		
		add(button);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "메뉴 항목 1은 선택하면 안됩니다.", "함정", JOptionPane.ERROR_MESSAGE);
		}
		
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(this, "어흥", "사자 등장", JOptionPane.PLAIN_MESSAGE, new ImageIcon("./res/lion.png"));
			button.setText("사자 왔다감");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cbMenuItem1) {
			// 체크 박스 메뉴 항목에 대한 처리

			String[] dessert = { "케이크", "초콜릿", "아이스크림", "과자", "사탕"};
			System.out.println((String) JOptionPane.showInputDialog(this, "후식을 선택하세요.", "후식 주문", JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("./res/smile.png"), dessert, dessert[3])); // 마지막 두번째: 배열(dessert)로 지정하면 선택, null 지정시 직접 입력

		}
	}

	public static void main(String args[]) {
		MenuTest f = new MenuTest();
		f.setSize(500, 200);
		f.setVisible(true);
	}
}
