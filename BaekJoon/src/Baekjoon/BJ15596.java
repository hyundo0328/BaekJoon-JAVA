package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ15596 {
	
	public static int plus(int num) {
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		
		bw.write(plus(num)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
