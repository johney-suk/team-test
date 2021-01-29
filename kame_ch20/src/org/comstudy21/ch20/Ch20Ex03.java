package org.comstudy21.ch20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex03 {

	public static void main(String[] args) throws IOException {
		int data = 0;

		InputStream In = System.in;
		FileOutputStream out = null;
		File file = new File("/Users/Hyunil/Desktop/out_test.txt");
		if (!file.exists()) {	// 최초 파일 생성시
			file.createNewFile();

		}
		out = new FileOutputStream(file);
		System.out.println("데이터 입력>> ");
		while ((data = In.read()) != -1) {
			out.write(data);
		}
		out.close(); // 쓰기 완료 후 닫기
		System.out.println("완료!");
	}

	public static void test(String[] args) throws IOException {
		int data = 0;

		InputStream In = System.in;
		OutputStream Out = System.out;

		System.out.println("데이터 입력>> ");
		while ((data = In.read()) != -1) {
			Out.write(data);
		}
		System.out.println("완료!");
	}

}
