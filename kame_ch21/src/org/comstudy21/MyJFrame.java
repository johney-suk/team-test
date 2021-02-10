package org.comstudy21;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
   public MyJFrame() {
      this(640,480,"My JFrame");
   }
   
   public MyJFrame(int width,int height, String title) {
      super(title);
      //닫기버튼의 이벤트 핸들러를 설정
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(width,height);
      
   }

}