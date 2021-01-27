package kame.ch17;

import java.awt.Button;
import java.awt.Frame;

public class Ch17Ex05 extends Frame {

	Button btn = new Button("Ok button");

	public Ch17Ex05() {
		setTitle("절대좌표로 레이아웃 꾸미기");

		setLayout(null);
		
		add(btn);
		btn.setBounds(100, 100, 200, 40);
		
		setSize(640, 480);
	}

	public static void main(String[] args) {
		new Ch17Ex05().setVisible(true);
	}

}
