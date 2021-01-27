package kame.ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex02 extends Frame {

	public Ch17Ex02() {
		setTitle("삼국지");
		setSize(300, 200);
		setVisible(true);
		
	addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		Ch17Ex02 win = new Ch17Ex02();

	}

}
