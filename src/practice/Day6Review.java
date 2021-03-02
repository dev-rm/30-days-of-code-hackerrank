import java.io.*;
import java.util.*;

public class Day6Review {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int noOfTestCases;
		String s;
		Scanner scan = new Scanner(System.in);
		noOfTestCases = scan.nextInt();

		for (int i = 1; i <= noOfTestCases; i++) {
			String evenChars, oddChars;
			evenChars = oddChars = "";
			s = scan.next();

			char[] sToChar = s.toCharArray();
			for (int j = 0; j < sToChar.length; j++) {
				if (j % 2 == 0) {
					evenChars += sToChar[j];
				} else {
					oddChars += sToChar[j];
				}
			}
			System.out.println(evenChars + " " + oddChars);
		}
		scan.close();
	}
}