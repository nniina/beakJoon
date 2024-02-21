package Q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2480

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		sc.close();
		
		if (x == y && y == z) {
			System.out.println(10000 + (x * 1000));
		} else if (x == y && x != z){
			System.out.println(1000 + (x * 100));
		} else if (y == z && x != z){
			System.out.println(1000 + (y * 100));
		} else if (z == x && y != z){
			System.out.println(1000 + (z * 100));
		} else {
			if (x > y && x > z) {
				System.out.println(x * 100);
			} else if(y > z && y > x) {
				System.out.println(y * 100);
			} else if(z > y && z > x) {
				System.out.println(z * 100);
			}
		}
	}
}
