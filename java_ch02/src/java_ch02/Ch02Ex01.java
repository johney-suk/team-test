package java_ch02;

import java.util.Arrays;

public class Ch02Ex01 {

	public static void main(String[] args) {
		int[] arr = new int[] {100,150};
		System.out.println(Arrays.toString(arr)); // [100, 150]
		swapElement(arr);
		System.out.println(Arrays.toString(arr)); // [150, 100]
	}
	
	static void swapElement(int[]arr) {
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

}
