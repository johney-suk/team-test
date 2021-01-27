package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.MyFrame;

public class Ch18Ex03 extends MyFrame {
   Panel centerPan = new Panel(new GridBagLayout());
   Panel southPan = new Panel();
   Label lbl = new Label("      Press any button!      ");
   Button btn1 = new Button("Button1");
   Button btn2 = new Button("Button2");
   
   public Ch18Ex03() {
      super(300, 120, "test button event");
      
      centerPan.add(lbl);
      southPan.add(btn1);
      southPan.add(btn2);
      
      add(BorderLayout.CENTER, centerPan);
      add(BorderLayout.SOUTH, southPan);
      
      // 내부 클래스로 BtnHandler클래스를 선언해서 사용한다.
      BtnHandler l = new BtnHandler();
      
      btn1.addActionListener(l);
      btn2.addActionListener(l);
   }
   
   // 이벤트 핸들러를 내부 클래스(inner class)로 선언한다.
   class BtnHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() instanceof Button) {
            // 이벤트 발생 요소가 Button이면 다운캐스팅 한다.
            Button btn = (Button)e.getSource();
            if(btn.equals(btn1)) {
               //System.out.println("Button 1을 눌렀다.");
               lbl.setText("You choice Button 1.");
            } else if(btn.equals(btn2)) {
               //System.out.println("Button 2를 눌렀다.");
               lbl.setText("You choice Button 2.");
            } 
         }
      }
   }

   public static void main(String[] args) {
      new Ch18Ex03().setVisible(true);
   }

}