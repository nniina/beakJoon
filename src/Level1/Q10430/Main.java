package Level1.Q10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10430
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		sc.close();
	}
}
