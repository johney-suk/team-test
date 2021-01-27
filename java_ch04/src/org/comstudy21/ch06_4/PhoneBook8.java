package org.comstudy21.ch06_4;

import java.util.Scanner;
// 진행중 name +"이 없습니다.
class Phone {
	String name;
	String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public Object getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

}

public class PhoneBook8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Phone phone[];
		System.out.println("인원수>>");
		int num = scan.nextInt();
		phone = new Phone[num];
		for (int i = 0; i < phone.length; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)");
			String name = scan.next();
			String tel = scan.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		while (true) {
			System.out.println("검색할 이름>>");
			String name = scan.next();
			for (int i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 번호는 " + phone[i].getTel() + "입니다.");

				}
			}
			if (name.equals("그만"))
				break;
			
		}

	}

}
