package org.comstudy21.ch19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Ch19Ex01 extends MyFrame {

	public Ch19Ex01() {
		super(640, 480, "Graphic example");

	}

	
	@Override
	public void paint(Graphics g) {
		// paint() 메소드는 자동으로 실행 된다.
		// System.out.println("paint() 메소드 호출...");
		Font f = new Font("Concolas", Font.BOLD, 36);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString("Hello World", 50, 150);
	
		
	}
	

	public static void main(String[] args) {
		new Ch19Ex01().setVisible(true);
	}

}
