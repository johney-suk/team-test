package org.comstudy21.ch06_4;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;  // 일 입력 받기
	}

	public void show() {
		if (work == null) // 할 일 없을때
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");

	}
}

public class MonthSchedule7 {
	Scanner scan;
	Day days[];	// Days 배열

	public MonthSchedule7(int day) {
		this.days = new Day[day]; 
		for (int i = 1; i < days.length; i++) {
			days[i] = new Day();
		}
		scan = new Scanner(System.in);
	}

	public void input() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scan.next();
		if (day < 1 || day > 30) { // 1보다 작거나 30일보다 크거나
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);

	}

	private void view() { // 날짜 입력받아서 저장된 input 출력
		System.out.println("날짜(1~30)?");
		int day = scan.nextInt();
		if (day < 1 || day > 30) { // 1보다 작거나 30일보다 크거나
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;

		}
		System.out.print((day) + "일의 할 일은 ");
		days[day].show();
	}

	private void finish() { // scan.close
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

	private void run() {
		System.out.print("이번달 스케쥴 관리 프로그램.");
		while (true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				input(); // 1. 입력
				break;
			case 2:
				view();	// 2. 보기
				break;
			case 3:
				finish();	// 3. 끝내기
				return;
			}
		}
	}

	public static void main(String[] args) {
		MonthSchedule7 april = new MonthSchedule7(30); // 4월달의 할 일
		april.run(); //할일(입력:1, 보기:2, 끝내기:3) 

	}

}
