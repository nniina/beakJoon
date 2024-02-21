package Q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9498
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
