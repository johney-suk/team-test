package org.comstduy21;

//11
//진행중
//https://djusti.tistory.com/25
import java.util.Scanner;
import java.util.Vector;

class tmp {
	String country;
	String city;

	tmp(String country, String city) {
		this.country = country;
		this.city = city;
	}

}

public class CountryCapital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<tmp> vec = new Vector<tmp>();
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		vec.add(new tmp("한국", "서울"));
		vec.add(new tmp("그리스", "아테네"));
		vec.add(new tmp("호주", "캔버라"));
		vec.add(new tmp("이탈리아", "로마"));
		vec.add(new tmp("독일", "뮌헨"));
		vec.add(new tmp("멕시코", "멕시코시티"));
		vec.add(new tmp("영국", "런던"));
		vec.add(new tmp("중국", "베이징"));
		vec.add(new tmp("일본", "도쿄"));
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("현재 " + vec.size() + "개 나라와 수도가 입력되어 있습니다.");
				while (true) {
					System.out.print("나라와 수도 입력" + (vec.size() + 1) + ">> ");
					String country = scan.next();
					if (country.equals("그만")) {
						break;
					}

				}

//			input();
				break;
			case 2:

//			quiz();
				break;
			case 3:
				break;
			}

		}

	}

}