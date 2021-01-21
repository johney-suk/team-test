package org.comstudy21.ch01;

import java.util.Scanner;

public class HwGugudan {

	static Scanner scan = new Scanner(System.in);
	static final int MIN = 2, MAX = 9;

	public static void main(String[] args) {
		// 구구단 출력을 3행 3열로 한다.
		// 시작단, 종료단형태로 변경 한다.
		System.out.println("시작단 입력: ");
		int startDan = scan.nextInt();
		while (startDan < 2 || startDan > 9) {
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

		for (int i = startDan; i < 10; i += 3) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 3; k++)
					if (k <= endDan)
						System.out.print(k + "*" + j + "=" + j * k + "\t");
				System.out.println(" ");
			}
		}
		System.out.println();

	}

}