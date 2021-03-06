package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int remainder = 0, count = 0, maximumOnes = 0;
        
        while(n>0){
            remainder = n%2;
            if(remainder == 1) count++;
            else count = 0;
            maximumOnes = Math.max(count, maximumOnes);
            n = n/2;
        }
        System.out.println(maximumOnes);
        scanner.close();
    }
}