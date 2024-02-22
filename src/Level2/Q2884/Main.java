package Level2.Q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2884
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45) {
			hour--;
			min = 60 - (45 - min);
			if (hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + min);
		} else {
			System.out.println(hour + " " + (min - 45));
		}
		sc.close();
	}
}
