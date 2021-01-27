package org.comstudy21.ch06_3;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	Day[] days = new Day[32]; // 0번지는 제외하고 1~30번지 사용.

	public void run() {
		while (true) {
			switch (menu()) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("해당 사항 없습니다!");
			}
			System.out.println();
		}
	}

	public int menu() {
		System.out.print("(입력:1, 보기:2, 끝내기:3) >>");
		return scan.nextInt();
	}

	public int choiceDay() {
		System.out.print("날짜(1~30)?");
		int day = scan.nextInt();
		while (day < 1 || day >= days.length) {
			System.out.println("날짜를 잘못 입력 했습니다.");
			System.out.print("날짜(1~30)?");
			day = scan.nextInt();
		}
		return day;
	}

	public void input() {
		int day = choiceDay();
		days[day] = new Day();
		System.out.print("할일(빈칸없이입력)?");
		days[day].set(scan.next());
	}

	public void view() {
		int day = choiceDay();
		if (days[day] == null) {
			System.out.println("");
			return;

		}
		System.out.printf("%d일의 할 일은 ", day);
		days[day].show();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		new MonthSchedule().run();
	}

}