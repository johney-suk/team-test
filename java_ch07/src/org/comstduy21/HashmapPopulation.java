package org.comstduy21;

//3번
//https://coding-factory.tistory.com/556
import java.util.HashMap;
import java.util.Scanner;

public class HashmapPopulation {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		while (true) {
			System.out.println("나라 이름, 인구 >>");
			String country = scan.next(); // 나라
			if (country.equals("그만")) { // 중지하고 검색
				break;
			}
			int pop = scan.nextInt(); // 인구 따로

			nations.put(country, pop); // 해시맵에 인수저
		}
		while (true) {
			System.out.print("인구 검색 >> ");
			String nation = scan.next();
			if(nation.equals("그만")) {
				break;
			}
			Integer population = nations.get(nation);

			if(population ==null) {
	//		if(nations = null) { 
				System.out.println(nation + " 나라는 없습니다.");
			}else {
				System.out.println(nation + "의 인구는 " + nations.get(nation)); 
			}
		}

	}

}
