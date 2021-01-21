package java_ch02;

import java.util.Arrays;

public class HwArray {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 40, 50, 60, 70 };

		int arr3[] = joinArr1(arr1, arr2);
		int arr4[][] = joinArr2(arr1, arr2);

		int arr5[][] = joinArr3(arr1, arr2);

		printArr(arr3); // 과제1 출력
		printArr2(arr4); // 과제2 출력
		printArr3(arr5); // 과제2-1 출력

	}

	private static int[] joinArr1(int[] arr1, int[] arr2) {
		// 과제1

		// 새로운 함수를 만들어서 1번 2번 길이를 합친 새로운 newArr 을 생성
		// 새로운 배열에 같은 변수값으로
		// newArr[i] = arr1[i]
		// arr1은 3개의 크기를가진 변수 i
		// i = 3 일때부터 arr2[0] 부터 arr2[3] 까지 newArr[3]부터 newArr[6]까지 넣기
		// newArr[i] = arr2[i+3]
		// 여기서 +3보다는 쓰여진 걸로대체 (종민씨 tip)
		// 3과 같은 길이 arr.length 사용
		// i가 2이하일때 arr1 사용
		// i < arr.length(3) -> newArr[i] = arr1[i]
		// i가 3이상일때 arr2 사용
		// 만약 newArr[3] 일때 arr2 는 ?
		// = arr2[ i - 3 ]
		// i >= arr.length(3) -> newArr[i] = arr2[i - 3]

		int newArr[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < newArr.length; i++) {
			if (i < arr1.length) {
				newArr[i] = arr1[i];
			}
			if (i >= arr1.length) {
				newArr[i] = arr2[i - 3];
			}

		}
		return newArr;
	}

	private static int[][] joinArr2(int[] arr1, int[] arr2) {
		// 과제2

		// 2차배열에 비울수있음
		// 그림 그려보기
		// = int[][] newArr2 = new int[2][]
		// 2칸(?)을 만들고 안에는 비운다 [0]:2칸 [1]:2칸 -> [2] []
		// [0] -> arr1
		// = newArr2[0] 에는 arr1 길이만큼
		// arr1.length 만큼 for문 사용
		// i 변수를 이용해 arr1[i]를 newArr2[0][i]의 비어있는 곳에 넣기
		// arr1[0] = newArr2[0][0], arr1[1] = newArr2[0][1] , arr1[2] = newArr2[0][2]
		// newArr2[1]에도 똑같이..
		// newArr2[1][i] = arr2[i];
		// arr1[1] = newArr2[1][0], arr1[1] = newArr2[0][1] , arr1[2] = newArr2[0][2]

		// 이차배열은 출력할때 for문으로
		// 출력 해야하는 목록 : arr4[0], arr4[1]
		// i = 0; i < 2
		// Array.toString(arr4[i])

		int newArr2[][] = new int[2][];
		newArr2[0] = new int[arr1.length];
		newArr2[1] = new int[arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr2[0][i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr2[1][i] = arr2[i];
		}

		return newArr2;
	}

	private static int[][] joinArr3(int[] arr1, int[] arr2) {
		// 과제2 두번째
		// 이차배열을 선언하고 newArr3라는 변수로
		// 배열에 들어갈 값이 정해져 있기
		// 배열에 저장할 값을 넣기
		// newArr3 [0] -> arr1[] = { 10, 20, 30 };
		// newArr3 [1] -> arr2[] = { 40, 50, 60, 70 };

		// 출력은 똑같이 for문으로 0부터 1까지

		int[][] newArr3;
		newArr3 = new int[][] { arr1, arr2 };
		return newArr3;

	}

	private static void printArr(int[] arr3) {
		// arr3
		System.out.println("---과제1 정답---");
		System.out.println(Arrays.toString(arr3));

	}

	private static void printArr2(int[][] arr4) {
		// arr4
		System.out.println("\n---과제2 정답---");
		for (int i = 0; i < 2; i++) {
			System.out.println(Arrays.toString(arr4[i]));
		}
	}

	private static void printArr3(int[][] arr5) {
		// arr5
		System.out.println("\n---과제2-1 정답---");
		for (int i = 0; i < 2; i++) {
			System.out.println(Arrays.toString(arr5[i]));
		}
	}
}
