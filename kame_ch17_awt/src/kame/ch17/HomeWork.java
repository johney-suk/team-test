package kame.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HomeWork extends Frame {

	Panel p1 = new Panel(new GridLayout(4, 2,0,20));
	Panel p2 = new Panel(new GridBagLayout());

	Panel p3 = new Panel(new GridLayout(1, 5));
	Panel p4 = new Panel(new GridBagLayout());
	
	Panel p5 = new Panel(new GridLayout(1, 1,0,20));
	
	Label label_Num = new Label("번호");
	Label label_Name = new Label("이름");
	Label label_Email = new Label("이메일");
	Label label_Tel = new Label("전화번호");
	
	TextField txtNum = new TextField(5);
	TextField txtName = new TextField(10);
	TextField txtEmail = new TextField(10);
	TextField txtTel = new TextField(10);
	TextField txtBlank = new TextField(100);

	Button btn1 = new Button("전체보기");
	Button btn2 = new Button("추가");
	Button btn3 = new Button("삭제");
	Button btn4 = new Button("검색");
	Button btn5 = new Button("취소");

	public HomeWork() {
		setTitle("사용자 관리 프로그램");
		setSize(640, 480);
		p2.add(p1);
		p4.add(p3);
		
		p1.add(label_Num);
		p1.add(txtNum);
		p1.add(label_Name);
		p1.add(txtName);
		
		p1.add(label_Email);
		p1.add(txtEmail);
		
		p1.add(label_Tel);
		p1.add(txtTel);
		
		p3.add(btn1);
		p3.add(btn2);
		p3.add(btn3);
		p3.add(btn4);
		p3.add(btn5);
		p5.add(txtBlank);
		


		add(BorderLayout.WEST, p2);
		add(BorderLayout.SOUTH, p4);
		add(BorderLayout.EAST, p5);



		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new HomeWork().setVisible(true);

	}

}
