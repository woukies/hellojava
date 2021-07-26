package doing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {

	public static void main(String[] args) {

		new GridLayoutFrame();

	}

}

class GridLayoutFrame extends JFrame {
	public GridLayoutFrame() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 2, 2)); // 초과시 행 기준
		setSize(600, 300);

		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		add(new JButton("버튼6"));
		add(new JButton("버튼7"));
		add(new JButton("버튼8"));
		add(new JButton("버튼9"));

		// pack(); // p316
		setVisible(true);
	}
}