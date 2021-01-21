package org.comstudy21.ch01_2;

import java.util.Scanner;

public class Ch01Ex04 {
	static int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int total = 0;
	static int month = 0;
	static int day = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 월일을 입력 받아서 100일 후의 날짜를 출력하는 프로그램.
		// 월일 입력
		// 포문으로 day에 100 더하기
		// 만약 day가 해당 day의 최대 일 초과시 month ++
		// 100더해진 day는 다시 -100
		// 12월 이후 다시 1월로 초기화

		int dday = 0;
		int a = 0;
		System.out.print("월입력>>> ");
		month = scan.nextInt();
		System.out.print("일입력>>> ");
		day = scan.nextInt();

		for (int i = 1; i < 101; i++) {
			dday = day + i;
			if (dday > days[month - 1]) {
				month++;
			}
			if(month == 12) {
				month = 1;
			}
		}
		a = dday-100;

		System.out.println(month + "월  " + a + "일");
	}

}
