package practice;

import java.io.*;
import java.util.*;

public class Day4ClassVsInstance {
    private int age;	
  
	public Day4ClassVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
          }
          else
            this.age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          String ageStatement = null;
          if(age < 13){
            ageStatement ="You are young.";
          }
           else if (age >= 13 && age < 18){
            ageStatement = "You are a teenager.";
           }
           else {
            ageStatement = "You are old.";
           }
           System.out.println(ageStatement);
	}

	public void yearPasses() {
  		// Increment this person's age.
          age = age + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVsInstance p = new Day4ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}