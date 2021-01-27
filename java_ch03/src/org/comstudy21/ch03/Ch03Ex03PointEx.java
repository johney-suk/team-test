package org.comstudy21.ch03;

class People {
   String name;
   String phone;
   String address;

   // 생성자는 멤버를 초기화 하는 목적이 있는 메소드
   // 리턴하지 않고 리턴형도 없다.
   // 생성자 메소드의 이름은 클래스의 이름과 동일 해야 한다.
   // 생성자도 함수이므로 함수의 다른 특징을 모두 가진다.
   // 생성자 Override - 생성자 재정의
   public People(String name, String phone, String address) {
      // super(); <--- 부모의 생성자를 호출 하는것으로 여기서는 필요가 없다.
      this.name = name;
      this.phone = phone;
      this.address = address;
   }

   // 재정의 -
   @Override
   public String toString() {
      return String.format("%-6s\t%-17s\t%s\n", name, phone, address);
   }

}

public class Ch03Ex03PointEx {

   public static void main(String[] args) {
//      People kim = new People();
//      kim.name = "김유신";
//      kim.phone= "010-1234-5678";
//      kim.address = "서울시 종로구 견지동";
      People kim = new People("김일성", "010-1234-5656", "평안남도 평양시");

//      System.out.println(kim.name + kim.phone + kim.address);
      System.out.println(kim.toString());
   }

}