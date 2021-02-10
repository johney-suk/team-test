package org.comstudy21.ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.comstudy21.MyJFrame;

public class Ch21Ex01 extends MyJFrame implements ActionListener{   
   JPanel contentPane;
   
   JLabel lbl1 = new JLabel("이      름 : ");
   JLabel lbl2 = new JLabel("아  이  디 : ");
   JLabel lbl3 = new JLabel("패스워드 : ");
   JLabel lbl4 = new JLabel("나      이 : ");
   JTextField tf1 = new JTextField(20);
   JTextField tf2 = new JTextField(20);
   JTextField tf3 = new JTextField(20);
   JTextField tf4 = new JTextField(20);
   
   JPanel gridBagLayouJPane = new JPanel(new GridBagLayout());
   JPanel centerPane = new JPanel(new GridLayout(5,1));
   JPanel componentPane1 = new JPanel(new FlowLayout());
   JPanel componentPane2 = new JPanel(new FlowLayout());
   JPanel componentPane3 = new JPanel(new FlowLayout());
   JPanel componentPane4 = new JPanel(new FlowLayout());
   JPanel componentPane5 = new JPanel(new FlowLayout());
   
   JButton btn1 = new JButton("가입하기");
   JButton btn2 = new JButton("다시쓰기");
   
   public Ch21Ex01() {
      super(640, 480, "text field layout");
      
      // 콤포넌트를 붙여줄 panel의 참조 값
      contentPane = (JPanel)getContentPane();

      componentPane5.add(btn1);
      componentPane5.add(btn2);
      
      componentPane1.add(lbl1);
      componentPane1.add(tf1);
      componentPane2.add(lbl2);
      componentPane2.add(tf2);
      componentPane3.add(lbl3);
      componentPane3.add(tf3);
      componentPane4.add(lbl4);
      componentPane4.add(tf4);
   
      gridBagLayouJPane.add(centerPane);
      contentPane.add(BorderLayout.WEST, gridBagLayouJPane);
      centerPane.add(componentPane1);
      centerPane.add(componentPane2);
      centerPane.add(componentPane3);
      centerPane.add(componentPane4);
      centerPane.add(componentPane5);
      
      setVisible(true);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      String message = "";
      if(e.getSource() instanceof JButton) {
         JButton button = (JButton)e.getSource();
         if(button == btn1) {
            message = tf1.getText() +"님 가입 성공!\n";
         } else {
            message = "취소를 선택 하셨습니다.";
         }
      }
      JOptionPane.showMessageDialog(this, message);
   }

   public static void main(String[] args) {
      new Ch21Ex01();
   }
}