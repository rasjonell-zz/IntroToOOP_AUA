package hw01;

import java.util.Scanner;

public class OneMoreSecond {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int full_time = input.nextInt();
		input.close();
		
		int hours = full_time/10000;
		int minutes = full_time/100 % 100;
		int seconds = full_time % 100;
		
		if(hours > 23 || minutes > 59 || seconds > 59) {
			System.out.println("Invalid input");
		} else {
			seconds++;
			
			if(seconds == 60) {
				seconds = 0;
				minutes++;
				
				if(minutes == 60) {
					minutes = 0;
					hours++;
					
					if(hours == 24) {
						hours = 0;
					}
				}
			}
			
			System.out.println(hours + (hours == 0 ? "0:" : ":")
					+ minutes + (minutes == 0 ? "0:" : ":")
					+ seconds + (seconds == 0 ? "0" : ""));
		}
		

	}
}
