package org.comstudy21.ch01;

import java.util.Arrays;

public class Ch01Ex02Array {
	// 낙타봉 표기법
	// 스칼라 표기법 - 스네이크 케이스
	// MAX_SIZE, my_name
	public static void main(String[] args) {
		final int MAX = 6;
		final int SIZE = 6;
		int[] ball = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			ball[i] = i + 1;
		}
		for (int i = 0; i < SIZE;) {
			int idx = 5 + (int) (Math.random() * MAX);
			if (ball[idx] != 0) {
				int number = ball[idx];
				System.out.print(number + ", ");
				ball[idx] = 0;
				i++;
			}
		}
	}

	public static void lotto5(String[] args) {
		// 로또번호 검색기 만들기
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;

		while (cnt < SIZE) {
		
			int number = 1 + (int) (Math.random() * MAX);
			// 배열의 각 요소와 비교해서 중복 된것이 있는가?
			for (int i = 0; i < cnt; i++) {
				if (number == lotto[i]) {
					// 배열에 이미 같은것이 있다면 새 number를 만든다.
					number = 1 + (int) (Math.random() * MAX);
					// 0번지부터 number와 다시 비교 되도록 설정한다.
					i = -1;
				}
			}
			lotto[cnt++]=number; // 중복 된것이 없다면 값 사용
		}
		
		System.out.println(Arrays.toString(lotto));
	}

	public static void lotto4(String[] args) {
		// 로또번호 검색기 만들기
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;

		while (cnt < SIZE) {
			int number = 1 + (int) (Math.random() * MAX);
			// 배열의 각 요소와 비교해서 중복 된것이 있는가?
			for (int i = 0; i < cnt; i++) {
				if (number == lotto[i]) {
					// 배열에 이미 같은것이 있다면 새 number를 만든다.
					number = 1 + (int) (Math.random() * MAX);
					// 0번지부터 number와 다시 비교 되도록 설정한다.
					i = -1;
				}
			}
			lotto[cnt++] = number; // 중복 된것이 없다면 값 사용
		}

		System.out.println(Arrays.toString(lotto));
	}
	// 과제 1 : 시작단, 종료단 결과 3행 3열로 출력
	// 과제 2 : 로또번호 검색기 최소한 3가지 형태로 만들기
}