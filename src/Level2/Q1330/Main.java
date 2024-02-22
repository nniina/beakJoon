package Level2.Q1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1330

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
		
		sc.close();
	}
}
