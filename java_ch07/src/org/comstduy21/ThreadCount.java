package org.comstduy21;

public class ThreadCount {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i < 11; i++) {
			Thread.sleep(3000);
			System.out.println(i);
		}
	}
}
