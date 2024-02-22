package Level3.Q25304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/25304
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int price = sc.nextInt();
			int cnt = sc.nextInt();
			
			total = total - (price * cnt);
		}
		
		sc.close();
		
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
