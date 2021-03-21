package practice;

import java.io.*;
import java.util.*;

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int testCaseNo = scan.nextInt();
		for (int i = 1; i <= testCaseNo; i++) {
			int n = scan.nextInt();
			boolean isPrime = isPrime(n);
			if (isPrime)
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		else {
			for (int i = 3; i <= Math.sqrt(n); i += 2) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}
}
