package org.comstudy21.ch03_2;

import java.util.Scanner;

public class StudentManager {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	static final int MAX = 2;
	static Student[] stArr = new Student[MAX];
	static int top = 0;
	
	static Student mkStudent() {
		Student student = new Student();
		System.out.print("성명>>> ");
		student.name = scan2.nextLine();
		System.out.print("학과>>> ");
		student.mj = scan.next();
		System.out.print("성적>>> ");
		student.score = scan.nextDouble();
		System.out.print("등수>>> ");
		student.rank = scan.nextInt();
		
		return student;
	}
	
	static int menu() {
		int no = 0;
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("Choice>>> ");
		try {
			no = scan.nextInt();
		} catch (Exception e) {
			System.out.println("정수만 입력 가능합니다!");
			scan.next(); // 버퍼를 비워준다.
			menu(); // 재귀호출
		}
		return no;
	}
	
	static void input() {
		System.out.println("::: INPUT :::");
		// stArr 배열의 top번지에 객체를 생성하고 top을 증가한다.
		if(top>=MAX) {
			System.out.println("더 이상 입력 불가능합니다!");
			return;
		}
		stArr[top++] = mkStudent();
		System.out.println("입력 성공!!");
	}
	
	static void output() {
		System.out.println("::: OUTPUT :::");
		for(int i=0; i<top; i++) {
			System.out.println(stArr[i]);
		}
	}
	
	static void search() {
		System.out.println("::: SEARCH :::");
	}
	
	static void modify() {
		System.out.println("::: MODIFY :::");
	}
	
	static void delete() {
		System.out.println("::: DELETE :::");
	}
	
	static void end() {
		System.out.println("::: END :::");
		System.out.println("프로그램을 종료합니다. \n수고하셨습니다!");
		System.exit(0);// 강제 종료!
	}

	public static void main(String[] args) {
		while(true) {
			int no = menu();
			switch(no) {
			case 1 : input(); break;
			case 2 : output(); break;
			case 3 : search(); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : end(); break;
			default : System.out.println("경고: 해당사항 없습니다!");
			}
			System.out.println("---------------------------------");
		}
	}
}