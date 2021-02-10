package org.comstudy21.ch06_3;

import java.util.*;

import org.comstudy21.ch06_3.Student;

public class HwHashMap {
	static Scanner scan = new Scanner(System.in);

	static ArrayList<Student> list = new ArrayList<Student>();

	private static void input() {
		System.out.print("성명>>> ");
		String name = new String();
		name = scan.next();

		System.out.print("학과>>> ");
		String mj = new String();
		mj = scan.next();

		System.out.print("성적>>> ");
		 score= ;
		score = scan.next();

		System.out.print("등수>>> ");
		int rank;
		rank = scan.nextInt();

		list.add(new Student(name, mj, score, rank));
	}

	public static void main(String[] args) {

		while (true) {
			int no = menu();
			switch (no) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
//				break;
//			case 4:
//				modify();
//				break;
//			case 5:
//				delete();
//				break;
//			case 6:
//				end();
//				break;
//			default:
//				System.out.println("경고: 해당사항 없습니다!");
			}
			System.out.println("---------------------------------");
		}
	}

	private static void search() {
		// Collection에 저장된 값 검색
//		for(int i = 0; i <3;i++) {
//			System.out.print("찾고 싶은 단어는?");
//			String eng = scanner.next();
//			// 해시맵에서 '키' eng의 '값' kor 검색
//			String kor = dic.get(eng);
//			if(kor == null)
//				System.out.println(eng+ "는 없는 단어 입니다.");
//			else
//				System.out.println(kor);

	}

	private static void output() {
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<list.size(); i++) 
			// ArrayList의 i 번째 문자열 얻어오기  
			String Student = list.get(i); 
			System.out.print();

	}

	private static int menu() {
		// 메뉴리스트
		int no = 0;
		System.out.println("1.input 2.output 3.search 4.modify 5.delete 6.end");
		System.out.print("Choice>>> ");
		try {
			no = scan.nextInt();
		} catch (Exception e) {
			System.out.println("정수만 입력 가능합니다!");
			scan.next(); // 버퍼를 비우기
			menu(); // 재귀호출
		}
		return no;
	}
}