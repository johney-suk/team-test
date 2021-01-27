package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.comstudy21.MyFrame;

class BtnEvtHandler implements ActionListener {
   Ch18Ex05 target;
   public BtnEvtHandler(Ch18Ex05 target) {
      this.target = target;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() instanceof Button) {
         Button btn = (Button)e.getSource();
         if(btn.equals(target.btn1) ) {
            target.lbl.setText(">>> You choice button 1.");
         } else if(btn.equals(target.btn2) ) {
            target.lbl.setText(">>> You choice button 2.");
         }
      }
   }
}

public class Ch18Ex05 extends MyFrame{
   Panel centerPan = new Panel(new GridBagLayout());
   Panel southPan = new Panel();
   Label lbl = new Label("      Press any button!      ");
   Button btn1 = new Button("Button1");
   Button btn2 = new Button("Button2");
   
   public Ch18Ex05() {
      super(300, 120, "test button event");
      
      centerPan.add(lbl);
      southPan.add(btn1);
      southPan.add(btn2);
      
      add(BorderLayout.CENTER, centerPan);
      add(BorderLayout.SOUTH, southPan);
      
      BtnEvtHandler handler = new BtnEvtHandler(this);
      
      btn1.addActionListener(handler);
      btn2.addActionListener(handler);
   }

   public static void main(String[] args) {
      new Ch18Ex05().setVisible(true);
   }
}