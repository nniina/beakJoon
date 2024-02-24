package Level3.Q2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2439
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cnt; i++) {
			String val = "";
			for (int j = 1; j < cnt - i; j++) {
				val = val + " ";				
			}
			for (int k = 0; k < i + 1; k++) {
				val = val + "*";
			}
			bw.write(val + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
