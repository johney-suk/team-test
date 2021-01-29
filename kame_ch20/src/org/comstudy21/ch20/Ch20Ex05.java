package org.comstudy21.ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch20Ex05 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		System.out.println("성명입력>> ");
		String name = in.readLine();
		System.out.println("주소입력>> ");
		String addr = in.readLine();
		
		System.out.println("성명>> "+name);
		System.out.println("주소>> "+ addr);
		

		
	}

}
