package org.comstduy21;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		String var1, var2;
		Scanner scan = new Scanner(System.in);

		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.println("철수 >>"); 
		var1 = scan.next(); 
		System.out.println("영희 >>");
		var2 = scan.next();
		// 비긴경기
		if (var1.equals("가위") && var2.equals("가위")) {
			System.out.println("비겼습니다.");
		}
		if (var1.equals("바위") && var2.equals("바위")) {
			System.out.println("비겼습니다.");
		}
		if (var1.equals("보") && var2.equals("보")) {
			System.out.println("비겼습니다.");
		}
		// 철수가 이긴경기
		if (var1.equals("가위") && var2.equals("보")) {
			System.out.println("철수가 이겼습니다.");
		}
		if (var1.equals("바위") && var2.equals("가위")) {
			System.out.println("철수가 이겼습니다.");
		}
		if (var1.equals("보") && var2.equals("바위")) {
			System.out.println("철수가 이겼습니다.");
		}
		// 영희가 이긴경기
		if (var1.equals("보") && var2.equals("가위")) {
			System.out.println("영희가 이겼습니다.");
		}
		if (var1.equals("가위") && var2.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		if (var1.equals("바위") && var2.equals("보")) {
			System.out.println("영희가 이겼습니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
