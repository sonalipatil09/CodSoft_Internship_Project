package com.task4currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

	static void ruppesToDollars(int putAmount) {

		double ruppesToDollars = (double) (putAmount * 0.012);
		System.out.println(putAmount + " Rupees in Dollars is : " + ruppesToDollars + " Dollars $");
	}

	static void ruppesToEuros(int putAmount) {

		double ruppesToEuros = (double) (putAmount * 0.011);
		System.out.println(putAmount + " Rupees in Euros is : " + ruppesToEuros + " Euros");
	}

	static void dollarsToEuros(int putAmount) {

		double dollarsToEuros = (double) (putAmount * 0.93);
		System.out.println(putAmount + " Dollars in Euros is : " + dollarsToEuros + " Euros");
	}

	static void dollarsToRupees(int putAmount) {

		double dollarsToRupees = (double) (putAmount * 82.93);
		System.out.println(putAmount + " Dollars in Ruppes is : " + dollarsToRupees + " Rupees");
	}

	static void eurosToDollars(int putAmount) {

		double eurosToDollars = (double) (putAmount * 1.08);
		System.out.println(putAmount + " Euros in Dollars is : " + eurosToDollars + " Dollars $");
	}

	static void eurosToRupees(int putAmount) {

		double eurosToRupees = (double) (putAmount * 89.61);
		System.out.println(putAmount + " Euros in Rupees is : " + eurosToRupees + "Rupees");
	}

	public static void main(String[] args) {

		System.out.println("Choose your base currency which u want to convert into target Currency: ");
		System.out.println("1: " + "ruppesToDollars");
		System.out.println("2: " + "ruppesToEuros");
		System.out.println("3: " + "dollarsToEuros");
		System.out.println("4: " + "dollarsToRupees");
		System.out.println("5: " + "eurosToDollars");
		System.out.println("6: " + "eurosToRupees");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency exchange option you want to have :");
		int chooseCurrency = sc.nextInt();

		System.out.println("Enter your amount want to convert into your choosen exchange rate : ");
		int putAmount = sc.nextInt();
		
		switch (chooseCurrency) {
		case 1:
			ruppesToDollars(putAmount);
			break;

		case 2:
			ruppesToEuros(putAmount);
			break;

		case 3:
			dollarsToEuros(putAmount);
			break;

		case 4:
			dollarsToRupees(putAmount);
			break;

		case 5:
			eurosToDollars(putAmount);
			break;

		case 6:
			eurosToRupees(putAmount);
			break;

		default:
			System.out.println("Invalid Input!!!!! Please check shown exchange rate and enter valid input");
		}
	}
}
