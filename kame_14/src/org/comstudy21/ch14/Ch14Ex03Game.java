package org.comstudy21.ch14;


import java.awt.Button;

import org.comstudy21.MyFrame;

public class Ch14Ex03Game extends MyFrame implements Runnable {
   Button btn = new Button("can you Push this button?");
   int x=20, y=50;
   int speed = 10;
   
   public Ch14Ex03Game() {
      super(640, 480, "My Game");
      
      setLayout(null);
      add(btn);
      btn.setBounds(x, y, 50, 25);
      Thread t = new Thread(this);
      t.start();
   }
   
   @Override
   public void run() {
      while(true) {
         try {
            Thread.sleep(500);
            x=x+speed;
            btn.setBounds(x, y, 50, 25);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

   public static void main(String[] args) {
      new Ch14Ex03Game().setVisible(true);
   }

   

}