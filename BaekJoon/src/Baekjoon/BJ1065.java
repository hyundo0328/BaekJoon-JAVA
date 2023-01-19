package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ1065 {
	
	public static void hansu(int num) {
		int count = 0;
		
		for(int i=1;i<=num;i++) {
			if(i<100) {
				count++;
			} else {
				int a = i%10;
				int b = (i/10)%10;
				int c = i/100;
				if((c-b)==(b-a)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		hansu(num);

		br.close();
		bw.flush();
		bw.close();
	}

}
