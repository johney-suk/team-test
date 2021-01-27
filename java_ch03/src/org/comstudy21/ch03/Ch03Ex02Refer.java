package org.comstudy21.ch03;

// class는 사용자 정의 타입
// 사용자가 임의로 만들어서 쓰는 데이터 타입
// 클래스 = 필드 + 메소드
// 필드 : 속성
// 메소드 : 일(함수)
class Point{
   int x;
   int y;
}
// 패키지 멤버

public class Ch03Ex02Refer {
   static void swap(Point p) {
      int temp = p.x;
      p.x = p.y;
      p.y = temp;
      
   }

   public static void main(String[] args) {
      Point p1= null;   // Point 타입의 참조변수 p1을 선언했다.
      p1 =new Point();
      
      p1.x = 100;
      p1.y = 200;

      swap(p1);
      System.out.println("p.x"+p1.x+", p1.y"+p1.y);
   }

}