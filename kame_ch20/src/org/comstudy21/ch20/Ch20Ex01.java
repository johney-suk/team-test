package org.comstudy21.ch20;

import java.io.IOException;

public class Ch20Ex01 {
	public static void main(String[] args) {
		System.out.print("나이 입력 >> ");
		int age = getNum();
		System.out.print("학년입력 >> ");
		int grade = getNum();
		
		System.out.printf("나이:%d, 학년:%d\n", age, grade);
	}
	public static int getNum() {
		int data = 0;
		int number = 0;

//		System.out.println("정수 입력>> ");
		try {
			while ((data = System.in.read()) != '\n') {
				if (data >= '0' && data <= '9') {
					number = number * 10 + data - '0';
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("number =>" +number);
//		System.out.println(number +" + 25 = "+ (number+25));
		return number;
	}

	public static void test(String[] args) throws IOException {
		int data = 0;

		System.out.print("입력>>> ");
		// 아스키코드 한개 입력 받기
		data = System.in.read();
		if (data >= 0 && data <= '9') {
			data = data - '0';
		}
		System.out.println("data =>" + data);

	}

}
