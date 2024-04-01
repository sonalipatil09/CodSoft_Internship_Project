package com.task2studentgradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	static boolean validateUserInput(int marks) {
		if (marks > 100 || marks < 0) {
			System.out.println("Invalid Input, please Enter marks should be between 0-100:");
			return true;
		}
		return false;
	}

	static int takeUserInput(Scanner sc) {

		int subMark;
		do {
			subMark = sc.nextInt();
		} while (validateUserInput(subMark));

		return subMark;
	}

	static void gradeCalculator(int total) {
		
		int percent = total / 5;
		System.out.println("Average Percentage is : " + percent + "%");
		
		if (percent >= 90) {
			System.out.println("Your Grade is A and Percent is " + percent);
		} else if (percent >= 80) {
			System.out.println("Your Grade is B");
		} else if (percent >= 70) {
			System.out.println("Your Grade is C");
		} else if (percent >= 60) {
			System.out.println("Your Grade is D");
		} else if (percent >= 50) {
			System.out.println("Your Grade is E");
		} else if (percent >= 40) {
			System.out.println("Your Grade is F");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Marathi Subject
		System.out.println("Enter your marks of Marathi");
		int marathi = takeUserInput(sc);

//		Maths Subject
		System.out.println("Enter your marks of Maths");
		int maths = takeUserInput(sc);

//		English Subject
		System.out.println("Enter your marks of English");
		int english = takeUserInput(sc);

//		Science Subject
		System.out.println("Enter your marks of Science");
		int science = takeUserInput(sc);

//		Hindi Subject
		System.out.println("Enter your marks of Hindi");
		int hindi = takeUserInput(sc);

		int totalMarks = marathi + maths + english + science + hindi;
		System.out.println("Total Marks is : " + totalMarks);

		gradeCalculator(totalMarks);

	}
}
