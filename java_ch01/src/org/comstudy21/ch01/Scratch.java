package org.comstudy21.ch01;

import java.util.Arrays;

public class Scratch {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60, 70 };

		int[] arr3 = joinArr(arr1, arr2);
		int[][] arr4 = joinArr2(arr1, arr2);

		printArr(arr3);
		printArr(arr4);

	}

	private static int[] joinArr(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];

		for (int i = 0; i < a.length + b.length; i++) {
			if (i < a.length) {
				result[i] = a[i];
			} else {
				result[i] = b[i - a.length];
			}
		}
		return result;
	}

	private static int[][] joinArr2(int[] a, int[] b) {
		int[][] result = { a, b };
		return result;
	}

	static void printArr(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	static void printArr(int[][] a) {
		for (int i = 0; i < 2; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}