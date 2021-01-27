package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;

import org.comstudy21.MyFrame;

public class Ch18Ex02 extends MyFrame {
   Panel centerPan = new Panel(new GridBagLayout());
   Panel southPan = new Panel();
   Label lbl = new Label("      Press any button!      ");
   Button btn1 = new Button("Button1");
   Button btn2 = new Button("Button2");
   
   public Ch18Ex02() {
      super(300, 120, "test button event");
      
      centerPan.add(lbl);
      southPan.add(btn1);
      southPan.add(btn2);
      
      add(BorderLayout.CENTER, centerPan);
      add(BorderLayout.SOUTH, southPan);
   }

   public static void main(String[] args) {
      new Ch18Ex02().setVisible(true);
   }

}