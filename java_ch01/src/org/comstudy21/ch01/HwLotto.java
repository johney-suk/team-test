package org.comstudy21.ch01;

import java.util.Arrays;
import java.util.Random;

public class HwLotto {
	static Random rand = new Random();

	public static void main(String[] args) {
		final int MAX = 45, SIZE = 6;
		int[] lotto = new int[SIZE];
		int cnt = 0;

		while (cnt < SIZE) {
			lotto[cnt] = 1 + rand.nextInt(MAX);

			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == lotto[cnt]) {
					cnt-=1;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto));
	}

}