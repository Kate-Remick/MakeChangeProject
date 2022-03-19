package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price?");
		double price = kb.nextDouble();
		System.out.println("What is the amount tendered?");
		double tendered = kb.nextDouble();

		makeChange(price, tendered);

		kb.close();
	}

	public static void makeChange(double price, double tendered) {
		int countTwenty = 0;
		int countTen = 0;
		int countFive = 0;
		int countOne = 0;
		int countQuarter = 0;
		int countDime = 0;
		int countNickle = 0;
		int countPenny = 0;

		if (tendered < price) {
			System.out.println("That is not enough money.");
		} else if (tendered > price) {
			double diff = (Math.round((tendered - price) * 100)) / 100.00;
			System.out.println("The difference comes out to: $" + diff);

			for (double twenty = 20.00; (diff > 0) && ((diff % twenty) >= 0) && (diff >= twenty); countTwenty++) {
				diff -= twenty;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			diff = (Math.round(diff * 100.00)) / 100.00;
			for (double ten = 10.00; (diff > 0) && ((diff % ten) >= 0) && (diff >= ten); ++countTen) {
				diff -= ten;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			for (double five = 5.00; (diff > 0) && ((diff % five) >= 0) && (diff >= five); ++countFive) {
				diff -= five;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			for (double one = 1.00; (diff > 0) && ((diff % one) >= 0) && (diff >= one); ++countOne) {
				diff -= one;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			for (double quarter = 0.25; (diff > 0) && ((diff % quarter) >= 0) && (diff >= quarter); ++countQuarter) {
				diff -= quarter;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			for (double dime = 0.10; (diff > 0) && ((diff % dime) >= 0) && (diff >= dime); ++countDime) {
				diff -= dime;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			for (double nickle = 0.05; (diff > 0) && ((diff % nickle) >= 0) && (diff >= nickle); ++countNickle) {
				diff -= nickle;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			diff = (Math.round(diff * 100.00)) / 100.00;
			for (double penny = 0.01; (diff > 0) && ((diff % penny) >= 0) && (diff >= penny); ++countPenny) {
				diff = diff - penny;
				diff = (Math.round(diff * 100.00)) / 100.00;
			}
			changeDisplay(countTwenty, countTen, countFive, countOne, countQuarter, countDime, countNickle, countPenny);

		} else {
			System.out.println("Thank you, have a great day!"); 
		}

	}

	private static void changeDisplay(int twenty, int ten, int five, int one, int quarter, int dime, int nickle,
			int penny) {
		System.out.println("Your change will be: ");
		if (twenty > 0) {
			System.out.println(twenty + " twenty(s)");
		}
		if (ten > 0) {
			System.out.println(ten + " ten(s)");
		}
		if (five > 0) {
			System.out.println(five + " five(s)");
		}
		if (one > 0) {
			System.out.println(one + " one(s)");
		}
		if (quarter > 0) {
			System.out.println(quarter + " quarter(s)");
		}
		if (dime > 0) {
			System.out.println(dime + " dime(s)");
		}
		if (nickle > 0) {
			System.out.println(nickle + " nickle(s)");
		}
		if (penny > 0) {
			System.out.println(penny + " penny(s)");
		}
		System.out.println("Thank you, have a great day!");
	}

}