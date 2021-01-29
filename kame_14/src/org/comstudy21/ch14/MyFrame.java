package org.comstudy21.ch14;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
   
   public MyFrame() {
      this(600,400,"My Frame");
   }

   public MyFrame(int width, int height, String title) {
      super(title);
      setSize(width, height);
      
      // 프레임 창을 스크린 화면 가운데 배치하기
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension scrSize = toolkit.getScreenSize();
      int x = (int)(scrSize.getWidth()/2 - width/2);
      int y = (int)(scrSize.getHeight()/2- height/2);
      setLocation(x,y);
      
      
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
         }
      });
   }

   public static void main(String[] args) {
      new MyFrame().setVisible(true);
   }
}