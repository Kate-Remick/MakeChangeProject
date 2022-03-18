package Change;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price?");
		double price = kb.nextDouble();
		System.out.println("What is the amount tendered?");
		double tendered = kb.nextDouble();
		
		makeChange(price, tendered);
		
		kb.close();
	}
	public static String makeChange(double price, double tendered) {
		String result = "";
		int countTwenty = 0;
	
		if(tendered < price) {
			result = "That is not enough money.";
		} else{
			double diff = price - tendered;
			if(price > tendered) {
				for (double twenty = 20.00;(diff % twenty) > 0; countTwenty++ ) {
					
				}
			}
			else {
				System.out.println("Thank you, have a great day!");
			}
		}
		
				
		return result;
	}

}
