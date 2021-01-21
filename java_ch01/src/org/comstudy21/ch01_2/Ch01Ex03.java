package org.comstudy21.ch01_2;

import java.util.Scanner;

public class Ch01Ex03 {
   // 멤버필드 - 자동 초기화된다. (숫자형은 0, 객체형은 null 로)
   static int[] days;
   static int total;
   static Scanner scan;
   // static 초기화 블럭 - 생성자보다 먼저 실행 되다.
   static {
       days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
       total = 0;
       scan = new Scanner(System.in);
   }
   // 초기화블럭은 대괄호만 사용 - 객체 생성 전에 호출됨.
   {
      total = 0;
   }
   // 생성자 - 객체를 생성할때 호출되는 메소드
   public Ch01Ex03() {
      // 멤버 필드를 초기화 하는 목적으로 호출 된다.
   }
   
   public static void main(String[] args) {
      // 월, 일을 입력받고 1월1일부터 월,일까지 몇일인지 계산한다.
      int month=0;
      int day = 0;
      
      System.out.print("월입력>>> ");
      month = scan.nextInt();
      System.out.print("일입력>>> ");
      day = scan.nextInt();
      
      // total에 날짜를 누적하는 반복문.
      total = day;
      // 1월부터 현재월-1 전까지 날짜 누적
      for(int i=0; i<month-1; i++) {
         total += days[i];
      }
      
      System.out.print("1월 1일부터 ");
      System.out.printf("%d월 %d일까지는 %d일입니다.\n", month, day, total);
   }
   
   public static void test02(String[] args) {
      // 월을 입력 받아서 해당 월은 몇리까지 있는지 출력.
      // 지역변수(local variable)은 초기화가 필수.
      int month = 0;
      System.out.print("월 입력>>> ");
      month = scan.nextInt();
      
      System.out.printf("%d월은 %d일까지 있다.", month, days[month-1]);
   }

   public static void test01(String[] args) {
      System.out.println("100일 후 날짜를 구하는 프로그램");
      // 선언 된 메소드는 다른 메소드에서 호출 가능.
      test(); // 메소드 호출부
   }
   
   // 메소드 선언부
   public static void test() {
      // total에 누적한 소스코드를 단톡방에 올려 주세요.
      for(int i=0; i<days.length; i++) {
         //total = total + days[i];
         total += days[i];
      }
      System.out.printf("1년은 %d일입니다\n", total);
   }
}