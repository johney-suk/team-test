package org.comstduy21;
//8
//https://vaert.tistory.com/108

import java.util.HashMap;
import java.util.Scanner;

public class HashmapPoint {

	public static void main(String[] args) {
		HashMap<String, Integer> list = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.println("이름과 포인트 입력>>");
			String name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			int point = scan.nextInt();
			if(list.get(name)==null) {
				list.put(name, point);
			}else {
				list.put(name, list.get(name)+point);
			}
				
		}
		System.out.println(list);
	}

}