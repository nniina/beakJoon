package Level3.Q10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10950
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		sc.close();
	}
}
