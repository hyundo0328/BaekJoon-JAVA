package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		int tmp = num;
		int sum = a*10 + b;
		int count = 0;
				
		while (true) {
			if(tmp<10) {
				a = 0;
				b = tmp;
			} else {
				a = tmp / 10;
				b = tmp % 10;
			}
			tmp = b*10 + (a+b)%10 ;
			//bw.write(a+""+b+" ");
			sum = tmp;
			count++;
			// bw.write(sum+" "+count+"\n");
			if(sum==num) {
				break;
			}
		}
		bw.write(count+"\n");

		br.close();
		bw.flush();
		bw.close();
	}

}
