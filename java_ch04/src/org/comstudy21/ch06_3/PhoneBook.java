package org.comstudy21.ch06_3;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone() {
		this("", "");
	}

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public boolean check(String name) {
		return name.equals(this.name);
	}

}

public class PhoneBook {
	Phone[] arr;
	int size;
	Scanner scan = new Scanner(System.in);

	public PhoneBook() {
		// 생성자에서 인원수와 phone 정보 입력
		System.out.println("인원수>>");
		size = scan.nextInt();
		while (size < 1) {
			System.out.println("인원수는 1이상의 양수>>");
			size = scan.nextInt();
		}
		arr = new Phone[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new Phone();
			System.out.println("이름과 전화번호(이름과 전화번호는 빈칸없이 입력)>>");
			arr[i].setName(scan.next());
			arr[i].setTel(scan.next());

		}
		System.out.println(size + "개의 Phone정보가 저장 되었습니다.");

		// 생성이 끝나고 run()을 실행한다.
		run();
	}

	public void run() {
		String name = "";
		while (true) {
			System.out.print("검색할 이름>>");
			name = scan.next();
			if ("그만".equals(name))
				break;
			boolean flag = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].check(name)) {
					System.out.println(name + "의 번호는 " + arr[i].getTel() + "입니다.");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(name+"이 존재하지 않습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new PhoneBook();

	}
}
//		System.out.println("인원수 >>");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		Phone[] phone = new Phone[num];
//		for (int i = 0; i < phone.length; i++) {
//			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
//			String name = scan.next();
//			String tel = scan.next();
//			phone[i] = new Phone(name, tel);
//		}
//		System.out.println("저장되었습니다...");
//		while (true) {
//			System.out.println("검색할 이름>>");
//			String name = scan.next();
//			for (int i = 0; i < num; i++) {
//				if (name.equals(phone[i].getname())) {
//					System.out.println(phone[i]);
//					// System.out.println(phone[i].getname()+"의 번호는 "입니다")
//				}
//			}
//		}
//	}
//}
