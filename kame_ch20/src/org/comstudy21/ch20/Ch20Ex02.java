package org.comstudy21.ch20;

import java.io.IOException;

public class Ch20Ex02 {
	public static void main(String[] args) {
		System.out.print("성명입력>> ");
		String name = getStr();
		System.out.print("나이입력>> ");
		int age = Ch20Ex01.getNum();
		
		
		System.out.println(name + ", "+age);
	}
	public static String getStr() {
		byte[] by = new byte[256];
		
//		System.out.println("문장 입력 >>> ");
		try {
			System.in.read(by);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str= new String(by).trim();
//		System.out.println("입력 내용 : " + str);
//		System.out.println("출력 끝!");
		return str;
	}

	public static void test(String[] args) throws IOException {
		int data = 0;
		System.out.print("데이터 입력(종료: ctrl+z) >>");

		// EOF(-1) : End of file
		while ((data = System.in.read()) != -1) {
			System.out.print((char) data);
		}
	}

}
