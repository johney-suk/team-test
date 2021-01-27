package org.comstudy21.ch06_4;

import java.util.Arrays;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int temp[] = new int[a.length + b.length];
//		for (int i = 0; i < a.length; i++) {
//			temp[i] = a[i];
//		}
		for (int i = 0; i < temp.length; i++) {
			if (i < a.length) {
				temp[i] = a[i];
			} else {
				temp[i] = b[i - a.length];

			}

		}
		return temp;

	}

	public static void print(int[] a) {

		System.out.print(Arrays.toString(a));

	}

}

public class StaticEx9 {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 }; // 4
		int[] array2 = { 3, 6, -1, 100, 77 }; // 5
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}
}
