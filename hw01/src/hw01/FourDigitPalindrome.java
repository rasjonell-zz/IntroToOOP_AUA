package hw01;

import java.util.Scanner;

public class FourDigitPalindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		boolean isPalindrome = number/1000 == number % 10 && number/100 % 10 == number % 100 / 10;
		
		System.out.println(number + " is " + (isPalindrome ? "" : "not ") + "a palindrome");
	}

}
