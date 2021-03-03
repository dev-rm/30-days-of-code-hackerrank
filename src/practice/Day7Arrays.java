package practice;

import java.util.*;

public class Day7Arrays {
	public static void printArrayInReverse(int[] arr) {
		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		scanner.close();
		printArrayInReverse(arr);
	}
}