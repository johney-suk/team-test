package kame.ch17;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex04 extends Frame {

	Button[] btns = new Button[50];
	{
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("BTN" + i);
		}
	}

	public Ch17Ex04() {
		setTitle("::: Flowlayout:::");
		setSize(640, 480);
		
		// BorderLayout ===> FlowLayout 변경한다.
		setLayout(new GridLayout(5, 10, 6, 6));
		
		for (int i = 0; i < btns.length; i++) {
			this.add(btns[i]);
		}
		
		start();
	}

	private void start() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Ch17Ex04().setVisible(true);
		
	}

}
