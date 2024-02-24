package Level3.Q2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2438
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		String val = "";
		
		for (int i = 0; i < cnt; i++) {
			val = val + "*";
			bw.write(val + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
