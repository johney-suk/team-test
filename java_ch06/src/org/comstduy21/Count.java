package org.comstduy21;
//7�� (1),(2)

//https://reakwon.tistory.com/90

import java.util.Scanner;
import java.util.StringTokenizer;

public class Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String str = scan.nextLine();
			if (str.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
//			StringTokenizer stt = new StringTokenizer(str, " ");	
			String[] stt = str.split(" ");
//			System.out.println("���� ������ " + stt.countTokens());
			System.out.println("���� ������ " + stt.length);
		}

	}
}
