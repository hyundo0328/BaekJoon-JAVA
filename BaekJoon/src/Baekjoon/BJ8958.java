package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int sum = 0;
			int count = 0;
			for(int j=0;j<s.length();j++) {
				char tmp = s.charAt(j);
				if(tmp=='O') {
					count++;
					sum += count;
				} else {
					count=0;
				}
			}
			bw.write(sum+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
