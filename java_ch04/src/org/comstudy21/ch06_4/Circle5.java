package org.comstudy21.ch06_4;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x; // x, y, radius 초기화
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

	public int getRadius() {
		return radius;
	}
}

public class Circle5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
		int max = 0;
		
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble(); // x값 읽기.
			double y = sc.nextDouble(); // y값 읽기.
			int radius = sc.nextInt(); // radius값 읽기.
			c[i] = new Circle(x, y, radius); // Circle 객체 생성
		}
		
		for (int i = 0; i < c.length; i++) // 3번 입력
			if (max < c[i].getRadius()) { // 가장큰 radius가 max로
				max = c[i].getRadius();
			}
		
		for (int i = 0; i < c.length; i++)
			if (max == c[i].getRadius()) { // max와 맞는 radius를 출력
				System.out.println("가장 면적이 큰 원은 ");
				c[i].show(); // 모든 Circle 객체 출력
			}
		
		sc.close();
	}

}
