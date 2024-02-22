package Level3.Q8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/8393

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}
