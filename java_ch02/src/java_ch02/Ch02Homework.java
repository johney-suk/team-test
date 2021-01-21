package java_ch02;

import java.util.Scanner;

public class Ch02Homework {
	static Scanner scan = new Scanner(System.in);

	static int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int total = 0;
	static int month, day;
	static int nextmonth, nextday;

	public static void main(String[] args) {
		System.out.print("월입력 >>> ");
		month = scan.nextInt();
		System.out.print("일입력 >>> ");
		day = scan.nextInt();

		calendar();
	}

	static void calendar() {
		System.out.print(String.format("%d월 %d일의 ", month, day));

		// 100을 total 변수에 저장
		// 현재 달의 남은 날짜를 total에서 빼준다.
		// total 변수에서 한달씩 날짜를 뺀다.
		// total의 날짜 부족하다면 빼는것을 멈춘다.
		total = 100 - (days[month - 1] - day);
		int index = month;
		// index가 12가 돼면 0으로 변경한다.
		int size = days.length;
		while (total > days[index % size]) {
			total -= days[index % size];
			index++;
		}

		nextmonth = index % size + 1;
		nextday = total;
		System.out.println(nextmonth + "월");
		System.out.println(total + "일입니다.");
	}

}
