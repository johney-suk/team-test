package org.comstudy21.ch20;

import java.io.FileInputStream;
import java.io.OutputStream;

public class Ch20Ex04 {

	public static void main(String[] args) throws Exception {
		int data = 0;
		FileInputStream in = new FileInputStream("/Users/Hyunil/Desktop/out_test.txt");
		OutputStream out = System.out;

		while ((data = in.read()) != -1) {
			out.write(data);
		}
		System.out.println("읽어오기 완료!");

	}

}
