package class02;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		input.close();
		long l2r = number;
		long r2l = 0;
		
		while(number > 0) {
			r2l = r2l * 10 + number % 10;
			number /= 10;
		}
		
		System.out.println("The number " + l2r + " is " + (l2r == r2l ? "" : "not ") + "a palindrome.");
	}
}
