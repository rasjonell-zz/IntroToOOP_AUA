/*
 * Write a Java program that computes age in days
 */

import java.util.Scanner;

public class Age {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int b_date = input.nextInt();	//the birth date in yyyymmdd format
		int c_date = input.nextInt();	//the current date in yyyymmdd format
		double a_year = 365.25;		//the duration of the average year in days
		double a_month = a_year / 12;	//the duration of the average month in days

		System.out.println((int)(0.5 + (c_date / 10000 - b_date / 10000) * a_year + 
				(c_date % 10000 / 100 - b_date % 10000 / 100) * a_month +
				(c_date % 100 - b_date % 100)));
	}
}

//Comment 1: (int) x returns an integer part of a double x
//Comment 2: (int)(0.5 + x) rounds a double x to the closest int