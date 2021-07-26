package doing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SnowManPanel extends JPanel {


	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawArc(60, 80, 50, 50, 180, -180);  // 哭率 传
		g.drawArc(150, 80, 50, 50, 180, -180); // 坷弗率 传
		g.drawArc(70, 130, 100, 70, 180, 180);  // 涝
	}
}

public class SnowManFace extends JFrame {
	public SnowManFace() {
		setSize(280, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("传荤恩 倔奔");
		setVisible(true);
		add(new SnowManPanel());
	}

	public static void main(String[] args) {
		new SnowManFace();
	}
}