package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10757 {

	public static void main(String[] args) throws IOException {
		/* BigInteger 사용 */
//		Scanner in = new Scanner(System.in);
//		
//		BigInteger a = in.nextBigInteger();
//		BigInteger b = in.nextBigInteger();
//		
//		System.out.println(a.add(b)); // BigInteger는 a+b로 하면 안 됨
//		
//		in.close();
		
		
		/* 한 자리씩 계산 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		StringBuilder sb;
		st = new StringTokenizer(br.readLine()," ");
		
		sb = new StringBuilder(st.nextToken());
		String num1 = sb.reverse().toString();
		
		sb = new StringBuilder(st.nextToken());
		String num2 = sb.reverse().toString();
		
		int len = Math.max(num1.length(), num2.length());
		// int a[] = new int[len];
		// int b[] = new int[len];
		// int sum[] = new int[len+1];
		
		String sum = "";

		for(int i=0;i<len;i++) {
			
		}
		
//		for(int i=0;i<num1.length();i++) {
//			a[i] = num1.charAt(i)-'0';
//		}
//		for(int i=0;i<num2.length();i++) {
//			b[i] = num2.charAt(i)-'0';
//		}
//	
//		for(int i=0;i<len;i++) {
//			int tmp = a[i] + b[i];
//			sum[i] += tmp%10;
//			sum[i+1] += tmp/10;
//		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
