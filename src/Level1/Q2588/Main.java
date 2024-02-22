package Level1.Q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2588
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
		sc.close();
	}
}
