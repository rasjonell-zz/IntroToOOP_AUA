/*
 * Computes amount of full months between two given dates
 */

import java.util.Scanner;

public class Months {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int date1 = input.nextInt();
		int date2 = input.nextInt();
		int months = (date2 / 10000 - date1 / 10000) * 12 + (date2 % 10000 / 100 - date1 % 10000 / 100);
		
		if (date2 % 100 < date1 % 100)
			months--; //months = months - 1;
		
		System.out.println("Complete months: " + months);
	}
}
