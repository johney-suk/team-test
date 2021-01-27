package kame.ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ch17Ex01 {

	public static void main(String[] args) {
		Frame frm = new Frame("삼국지");
		frm.setSize(300, 200);
		frm.setVisible(true);

		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frm.dispose();
				System.exit(0);
			}
		});
	}

}
