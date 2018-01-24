/*
 * Checks a 3-digit number for being a palindrome
 */

import java.util.Scanner;

public class Palindrome3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num / 100 == num % 10)
			System.out.println(num + " is a palindrome");
		else 
			System.out.println(num + " is not a palindrome");
		
		System.out.println(num + " is" + (num / 100 == num % 10 ? "" : " not")  + " a palindrome");
		

}
}