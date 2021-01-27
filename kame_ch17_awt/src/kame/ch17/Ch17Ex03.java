package kame.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Ch17Ex03 extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	Panel p5 = new Panel();

	public Ch17Ex03() {
		setTitle("레이아웃 메니저 사용");
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.BLUE);
		p4.setBackground(Color.ORANGE);
		p5.setBackground(Color.GRAY);

		add(BorderLayout.NORTH, p1);
		add(BorderLayout.SOUTH, p2);
		add(BorderLayout.WEST, p5);
		add(BorderLayout.EAST, p4);
		add(BorderLayout.CENTER, p3);
		
		p1.add(new Button("NORTH BUTTON"));
		p2.add(new Button("SOUTH BUTTON"));
		p3.add(new Button("WEST BUTTON"));
		p4.add(new Button("EAST BUTTON"));
		p5.add(new Button("CENTER BUTTON"));


		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ch17Ex03();

	}

}
