package Level3.Q2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2739
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", x, i, x * i);
		}
	}
}
