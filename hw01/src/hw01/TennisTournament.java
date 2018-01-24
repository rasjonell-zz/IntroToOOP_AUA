package hw01;

import java.util.Scanner;

/* 
* Write a Java program that inputs from the console (keyboard)
* an amount of tennis players entering the tournament
* and prints the total amount of played games.
*/

public class TennisTournament {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num_players = input.nextInt();
		num_players = num_players % 2 == 0 ? num_players : num_players + 1;
		input.close();
		
		int result = 0;
		 
		while(num_players > 0) {
			result += num_players/2;
			num_players /= 2;
		}
		
		System.out.println(result);
		
	}
	
}
