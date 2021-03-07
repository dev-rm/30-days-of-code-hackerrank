package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11TwoDArrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		int totalRows = 6, totalCols = 6; // totalRows and totalCols can be different from the assigned values

		int rowNo = totalRows - 2, colNo = totalCols - 2, sum = 0;
		sum = calculateHourGlassSum(arr, rowNo, colNo);

		System.out.println(sum);

		scanner.close();
	}

	public static int calculateHourGlassSum(int[][] a, int rowsCount, int colsCount) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < rowsCount; i++) {
			for (int j = 0; j < colsCount; j++) {
				int tempSum = 0;

				// first row
				tempSum += a[i][j] + a[i][j + 1] + a[i][j + 2];

				// middle row
				tempSum += a[i + 1][j + 1];

				// third row
				tempSum += a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];

				if (maxSum < tempSum) {
					maxSum = tempSum;
				}
			}
		}
		return maxSum;
	}
}