package org.comstduy21;
//11번
//quiz 미완성
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalGame {
	HashMap<String, String> map = new HashMap<String, String>();
	Scanner scan = new Scanner(System.in);

	CapitalGame() {
		map.put("한국", "서울");
		map.put("그리스", "아테네");
		map.put("호주", "캔버라");
		map.put("이탈리아", "로마");
		map.put("독일", "뮌헨");
		map.put("멕시코", "멕시코시티");
		map.put("영국", "런던");
		map.put("중국", "베이징");
		map.put("일본", "도쿄");

	}

	void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				finish();
				return;
			}
		}

	}

	private void input() {
		int n = map.size();
		System.out.println("현재 " + n + "개 나라와 수도가 입력되어 있습니다.");

		while (true) {
			System.out.print("나라와 수도 입력" + n + ">> ");
			String country = scan.next();
			String capital = scan.next();
			if (map.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다!");
				continue;
			}

			if (country.equals("그만")) {
				break;
			}

			map.put(country, capital);
			n++;
		}
	}

	private void quiz() {
		Set<String> keys = map.keySet(); // 키는 나라 값은 수도
		String[] arr = (String[]) keys.toArray();
		while (true) {
			int ran = (int) (Math.random() * arr.length);
			System.out.print(ran + "의 수도는? ");
			
			String mycapital = scan.next();
			String answer =arr[ran]; //?
				
			if(mycapital.equals(answer)){
				System.out.println("정답!");
			}else {
				System.out.println("아닙니다!");
			}
				
		}

	}

	private void finish() {
		System.out.println("게임을 종료합니다.");
	}

	public static void main(String[] args) {
		CapitalGame game = new CapitalGame();
		game.run();

	}
}