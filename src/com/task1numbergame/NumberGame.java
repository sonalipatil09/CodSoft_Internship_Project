package com.task1numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	static int randomNo;
	static int userInput;

	public static int getRandomNumber() {

		Random r1 = new Random();
		int randomNo = r1.nextInt(99);
		System.out.println("Random number is: " + randomNo);
		return randomNo;
	}

	public static int takeUserInput(Scanner sc, int randomNo) {

		int userInput = sc.nextInt();
		
		while (userInput != randomNo) {
			System.out.println("Your guess is incorrect, please try again");
			userInput = sc.nextInt();
		}
		System.out.println("Congratulations!....... your guess is correct");
		return userInput;
	}

	public static void main(String[] args) {

		int randomNo = getRandomNumber();

		System.out.println("Guess the game number: ");
		Scanner sc = new Scanner(System.in);
		takeUserInput(sc, randomNo);
	}

}
