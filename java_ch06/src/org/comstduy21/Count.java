package org.comstduy21;
//7번 (1),(2)

//https://reakwon.tistory.com/90

import java.util.Scanner;
import java.util.StringTokenizer;

public class Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String str = scan.nextLine();
			if (str.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
//			StringTokenizer stt = new StringTokenizer(str, " ");	
			String[] stt = str.split(" ");
//			System.out.println("어절 개수는 " + stt.countTokens());
			System.out.println("어절 개수는 " + stt.length);
		}

	}
}
