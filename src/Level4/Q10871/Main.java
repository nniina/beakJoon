package Level4.Q10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		// https://www.acmicpc.net/problem/10871

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int cnt = Integer.parseInt(st.nextToken());
		int key = Integer.parseInt(st.nextToken());
		int[] arr = new int[cnt];
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < key) {
				bw.append(String.valueOf(arr[i]) + " "); 
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}