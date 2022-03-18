package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
//		System.out.println("What is the price?");
//		double price = kb.nextDouble();
//		System.out.println("What is the amount tendered?");
//		double tendered = kb.nextDouble();

		double mod = 6.57 % 3;
		System.out.println(mod);
//		makeChange(price, tendered);

		kb.close();
	}

	public static String makeChange(double price, double tendered) {
		String result = "";
		int countTwenty = 0;
		int countTen = 0;

		if (tendered < price) {
			result = "That is not enough money.";
		} else {
			double diff = price - tendered;
			if (price > tendered) {
				for (double twenty = 20.00; (diff % twenty) > 0; countTwenty++) {
					tendered += twenty;
				}
				for (double ten = 10.00; (diff % ten) > 0; countTen++) {
					
				}
			} else {
				System.out.println("Thank you, have a great day!");
			}
		}

		return result;
	}

}