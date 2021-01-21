package org.comstudy21.ch01_2;

import java.util.Scanner;

public class HwDday {
	static int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int total = 0;
	static int month = 0;
	static int day = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 두번째
		// 월일을 입력 받아서 100일 후의 날짜를 출력하는 프로그램.

		// 월일 입력
		// 포문으로 day에 100 더하기
		// 만약 day가 해당 day의 최대 일 초과시 month ++
		// 100더해진 day는 다시 -100
		// 12월 이후 다시 1월로 초기화

		// 실패

		
	
		System.out.print("월입력>>> ");
		month = scan.nextInt();
		System.out.print("일입력>>> ");
		day = scan.nextInt();
		int dday = day;
		for (int i = 1; i < 101; i++) {
			 dday ++;
			if (dday > days[month - 1]) {
				month++;
			dday = dday - days[month-1];
			}
			
			if (month > 12) {
				month = 1;
			}
		}

		System.out.println(month + "월  " + dday + "일");
	}

	public static void main01(String[] args) {
		// 첫번째

		// 100일 변수 total로 선언
		// total에 일 입력값 더하기
		// while 반복문으로
		// total 이 지정한 month의 최대 일 보다
		// 작아질때까지 반복
		// 그 과정에는 total에서 지정한 month의 일수를 뺀다.
		// 한번의 반복실행마다 month ++
		// 남은 total 값 -> dday

		// 성공? 1일이 더해짐

		System.out.print("월입력>>> ");
		month = scan.nextInt();
		System.out.print("일입력>>> ");
		day = scan.nextInt();

		total = 100;
		total = 100 + day;

		while (total > days[month - 1]) {
			total -= days[month - 1];
			month++;
			if (month == 12) {
				month = 1;
			}
		}

		System.out.println(month + "월  " + total + "일");

	}

}
