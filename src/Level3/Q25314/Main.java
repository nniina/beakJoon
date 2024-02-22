package Level3.Q25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/25314
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		StringBuffer buf = new StringBuffer(); 
		
		for (int i = 0; i < x/4; i++) {
			buf.append("long ");
		}
		System.out.print(buf + "int");
	}
}
