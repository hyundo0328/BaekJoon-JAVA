package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ11720 {

	public static void main(String[] args) throws IOException {
		/* Scanner 버전 */
		//Scanner in = new Scanner(System.in);
		
		//int num1 = in.nextInt();
		//String str = in.next();
		//int sum1 = 0;
		//
		//for(int i=0;i<num1;i++) {
		//	sum1 += (int)str.charAt(i)-(int)'0';
		//}
		//System.out.println(sum1);
		//
		//in.close();
		
		/* BufferReader 버전 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num2 = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum2 = 0;
		
		for(int i=0;i<num2;i++) {
			sum2 += (int)s.charAt(i)-(int)'0';
		}
		bw.write(sum2+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
