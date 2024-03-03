package Level4.Q10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		// https://www.acmicpc.net/problem/10807

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int key = Integer.parseInt(br.readLine());
		cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
