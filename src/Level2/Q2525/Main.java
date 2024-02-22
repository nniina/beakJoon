package Level2.Q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2525

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		sc.close();
	
		int x = 60 * hour + min;
		x += time;
		
		hour = (x / 60) % 24;
		min = x % 60;
		
		System.out.print(hour + " " + min);
	}
}
