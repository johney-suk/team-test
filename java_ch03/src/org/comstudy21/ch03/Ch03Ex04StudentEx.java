package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;

class Student {

   String name;
   String mj;
   double score;
   int rank;

   @Override // 오버라이드 - 상속관계 부모의 멤버를 재정의 (이유가머임?)
   public String toString() {
      return "[" + name + "," + mj + "," + score + "," + rank + "]"; // ????????
   }

   public Student() {
      // 디폴트 생성자
      System.out.println("디폴트 생성자 호출");

   }

   // 오버로드 - 같은클래스 같은 이름의 메소드를 추가해준다.
   // 시그너처 - 매개변수의 타입과 갯수가 된다.
   public Student(String name, String mj, double score, int rank) { // ?????????????
      this.name = name;
      this.mj = mj;
      this.score = score;
      this.rank = rank;
   }
}

public class Ch03Ex04StudentEx {
   static Scanner scan = new Scanner(System.in);
   static Scanner scan2 = new Scanner(System.in);
   
   static final int MAX = 50;
   static Student[] stArr = new Student[MAX];
   static int top = 0;
   
//   static String name,mj;
//   static double socre;
//   static int rank;

   static Student mkStudent() {

      Student student = new Student();
      System.out.print("성명>>>");
      student.name = scan2.nextLine();
      System.out.print("학과>>>");
      student.mj = scan.next();
      System.out.print("성적>>>");
      student.score = scan.nextDouble();
      System.out.print("등수>>>");
      student.rank = scan.nextInt();
      
      return student;
   }

   public static void main(String[] args) {
      Student[] arr = new Student[2];

      // 생성자 오버로딩이 되었을 때는 디폴트 생성자를 명시적으로 추가해야 한다.
      // 생성자 오버로딩이 되었을때는 컴파일러가 디폴트 생성자를 안만든다.
      for (int i = 0; i < arr.length; i++) {
         arr[i] = mkStudent(); // 객체ㅔ 생성해서 반환하는 메소드를 만든것
      }

//      System.out.println(Arrays.toString(arr));

      for (Student st : arr) {
         System.out.println(st);
      }

   }

   public static void test(String[] args) {
      Student kim = new Student("이름", "학과", 4.5, 10);
      Student lee = new Student("이순신", "전술과", 5.0, 1);
      Student park = new Student("박혁거세", "창업과", 4.8, 1);
//      System.out.println(kim); //????????????????

      Student[] stdArr = new Student[3]; // class가 여러개 만들어졌다는 소리는 참조변수가 여러개 만들어졌다는 의미
      stdArr[0] = kim;
      stdArr[1] = lee;
      stdArr[2] = park;

      stdArr[1].name = "이순자";
      stdArr[2].mj = "가정학과";
      for (Student std : stdArr) {
         System.out.println(std);
      }
   }

}