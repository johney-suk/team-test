package org.comstudy21.ch06_4;

import java.util.Scanner;

//case 1, 2 오류남



class Concert {
	public String S[];
	public String A[];
	public String B[];
	Scanner scan;

	public Concert() {

		S = new String[10];
		A = new String[10];
		B = new String[10];
		for (int i = 0; i < S.length; i++) {
			S[i] = "___";
			A[i] = "___";
			B[i] = "___";
		}
	}



	public void view() { // case2
		System.out.println("S>>");
		printSeat(S);
		System.out.println("A>>");
		printSeat(A);
		System.out.println("B>>");
		printSeat(B);

	}
	public void printSeat(String[] seat) { // 저장한거 출력 case 2-2
		for (int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i] + " ");
		}
		System.out.println();
	}

	public void choiceSeat() { // case1
		while (true) {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.print("S>>");
				printSeat(S);
				input(S);
				return;
			case 2:
				System.out.print("A>>");
				printSeat(S);
				input(S);
				return;
			case 3:
				System.out.print("B>>");
				printSeat(S);
				input(S);
				return;
			}
		}
	}

	public void input(String[] seat) { // case1-2
		System.out.print("이름>>");
		String name = scan.next();
		while (true) {
			System.out.print("번호>>");
			int num = scan.nextInt();
			if (seat[num].equals("___")) {
				seat[num] = name;
				break;
			}
		}

	}
}

	public class Concert12 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("명품콘서트홀 예약 시스템입니다.");
			System.out.println("예약:1, 조회:2, 취소3, 끝내기:4>>");
			int select = scan.nextInt();
			switch (select) {
			case 1:
//				input();
				break;
			case 2:
//				view();
				break;
			case 3:
//				cancle();
				break;
			case 4:
//				finish();
				return;
			}

		}

	}

