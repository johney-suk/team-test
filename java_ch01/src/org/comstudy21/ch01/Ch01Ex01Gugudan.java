package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex01Gugudan {
	// 멤버 필드(변수)
	// static은 클래스 멤버이다.
	// static이 없는것은 인스턴스 멤버이다.
	// 클래스, 객체
	// OOP (현실 세계에 있는 것들을 추상화 해서 프로그램으로 만드는것)
	static Scanner scan = new Scanner(System.in);
	static final int MIN = 2, MAX = 9;

	public static void main(String[] args) {
		// 구구단 출력을 3행 3열로 한다.
		// 시작단, 종료단형태로 변경 한다.
		System.out.println("시작단 입력: ");
		int startDan = scan.nextInt();
		while (startDan < 2 || startDan > 10) {
			System.out.println("2~9 사이 정수로 다시 입력");
			startDan = scan.nextInt();
		}
		System.out.println("끝나는단 입력: ");
		int endDan = scan.nextInt();
		while (endDan < startDan || endDan > 10) {
			System.out.println("2~9 사이 정수로 다시 입력");
			endDan = scan.nextInt();
		}
		if (startDan > endDan) {
			int tmp = startDan;
			startDan = endDan;
			endDan = tmp;
		}
//		for (int dan = startDan; dan <= endDan; dan += 3) {
//			   for(int i=0; i<3; i++){
//			   }
//			   for(int i=1; i<=9; i++){
//			    for(int j =0; j<3; j++){
//			     String str = (dan+j) + "*" + i + "=" + (dan+j)*i;
//			     System.out.print(dan+j<10 && dan+j <=(endDan)? str + "\t" : "");
		for (int i = 2; i < 10; i += 3) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 3; k++)
					System.out.print(k + "*" + j + "=" + j * k + "\t");
				System.out.println();
			}
			System.out.println();
		}
	}

	// 멤버 메소드(함수)
	public static void test04(String[] args) {
		int startDan = 0;
		int endDan = 0;

		System.out.println("몇단부터 시작 할까요?");
		while (startDan < MIN || startDan > MAX) {
			System.out.println("2~9사이 정수 입력 >>>");
			startDan = scan.nextInt();
		}
		System.out.println("몇단까지 시작 할까요?");
		while (endDan < MIN || endDan > MAX) {
			System.out.println("2~9사이 정수 입력 >>>");
			endDan = scan.nextInt();
		}
		// startDan이 endDan보다 크면 치환한다.
		if (startDan > endDan) {
			int tmp = startDan;
			startDan = endDan;
			endDan = tmp;
		}
		for (int dan = startDan; dan <= endDan; dan++) {
			System.out.println("\n" + dan + "단 시작");
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.println(dan + "*" + cnt + "=" + dan * cnt);
			}
		}
	}

	// 유효성 검사의 중요성.
	public static void test3(String[] args) {
		// 특수문자 문자열 : \" \' \@ \\
		// 나는 "홍길동이다"
		// System.out.println("나는 \"홍길동\"이다");
		for (int cnt = 1; cnt <= 9; cnt++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%s*%s=%s\t", dan, 1, dan * 1);
			}
			System.out.println();
		}
	}

	public static void test2(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("***" + dan + "***");
			for (int cnt = 1; cnt <= 9; cnt++) {
				String str = String.format("%d*%d=%d", dan, cnt, dan * cnt);
				System.out.println(str);
			}
		}
	}

	public static void test(String[] args) {
		// 2단 출력
		int dan = 2;
		for (int cnt = 1; cnt <= 9; cnt++) {
			// System.out.println(dan + "*"+cnt+"="+ dan*cnt);
			// 변환문자열기호 : %d, %o, %x, %s, %.3f ...
			// System.out.printf("%d*%d=%d\n",dan, cnt, dan*cnt);
			String str = String.format("%d*%d=%d", dan, cnt, dan * cnt);
			System.out.println(str);
		}
	}
}