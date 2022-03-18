package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
//		System.out.println("What is the price?");
//		double price = kb.nextDouble();
//		System.out.println("What is the amount tendered?");
//		double tendered = kb.nextDouble();

		double mod = (Math.round(100*(4.57 % 4)))/100;
		System.out.println(mod);
//		String result = makeChange(price, tendered);
//		System.out.println(result);

		kb.close();
	}

	public static String makeChange(double price, double tendered) {
		String result = "";
		int countTwenty = 0;
		int countTen = 0;
		int countFive = 0;
		int countOne = 0;
		int countQuarter = 0;
		int countDime = 0;
		int countNickle = 0;
		int countPenny = 0;

		if (tendered < price) {
			result = "That is not enough money.";
		} else if (tendered > price) {
			if (tendered > price) {
				double diff = tendered - price;
				for (double twenty = 20.00; (diff % twenty) > 0; countTwenty++) {
					diff -= twenty;
				}
				for (double ten = 10.00; (diff % ten) > 0; countTen++) {
					diff -= ten;
				}
				for (double five = 5.00; (diff % five) > 0; countFive++) {
					diff -= five;
				}
				for (double one = 1.00; (diff % one) > 0; countOne++) {
					diff -= one;
				}
				for (double quarter = 0.25; (diff % quarter) > 0; countQuarter++) {
					diff -= quarter;
				}
				for (double dime = 0.10; (diff % dime) > 0; countDime++) {
					diff -= dime;
				}
				for (double nickle = 0.05; (diff % nickle) > 0; countNickle++) {
					diff -= nickle;
				}
				for (double penny = 0.01; (diff % penny) > 0; countPenny++) {
					diff -= penny;
				}
				result = "" + countPenny;
			} else {
				System.out.println("Thank you, have a great day!");
			}
		}
		
		return result;
	}

}