package org.comstduy21;
//2번

//https://coding-factory.tistory.com/551

import java.util.ArrayList;
import java.util.Scanner;

public class AvgGpa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList mygpa = new ArrayList();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			String str = scan.next();
			mygpa.add(str);
		}
		double gpa = 0;
		for (int i = 0; i < mygpa.size(); i++) {
			String tmp = (String) mygpa.get(i);
			switch (tmp) {
			case "A":
				gpa += 4;
				break;
			case "B":
				gpa += 3;
				break;
			case "C":
				gpa += 2;
				break;
			case "D":
				gpa += 1;
				break;
			case "F":
				gpa += 0;
				break;
			}
		}
		System.out.println(gpa / 6);

	}

}