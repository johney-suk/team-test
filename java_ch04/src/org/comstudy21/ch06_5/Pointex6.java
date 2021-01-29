package org.comstudy21.ch06_5;
// 생성자 오류 같음

// 내일 다시풀기

class ColorPoint2 extends Point {
	String color;
	
	public ColorPoint2() {// 최초 생성자
		this(0, 0);
		this.color = "BLACK";

	}

	public ColorPoint2(int x, int y) {//입력받은 값을 인자로 받는 생성자
		super(x, y); // 부모 클래스의 인자 두개를 받는 생성자
	}

	

	public void setXY(int x, int y) { //void는 항상  호출시에 {}안을 실행
		move(x, y); // move실행 

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() { // 기능상관없이 리턴이 값받음.
		
		return (color + "색 (" + getX() + "," + getY() + ")의 점");
	}

}

public class Pointex6 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint2 cp = new ColorPoint2(10, 10); // (10,10) 위치의 BLACK 색 점
		
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
