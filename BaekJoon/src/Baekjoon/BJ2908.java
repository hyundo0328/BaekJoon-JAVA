package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2908 {

	public static void main(String[] args) throws IOException {
		/* Scanner 버전 */
//		Scanner in = new Scanner(System.in);
//		StringTokenizer st;
//		
//		String str = in.nextLine();
//		st = new StringTokenizer(str," ");
//		
//		String s1 = st.nextToken();
//		String s2 = st.nextToken();
//		String tmp = "";
//		
//		for(int i=2;i>=0;i--) {
//			tmp += s1.charAt(i);
//		}
//		s1 = tmp;
//		tmp = "";
//		
//		for(int i=2;i>=0;i--) {
//			tmp += s2.charAt(i);
//		}
//		s2 = tmp;
//
//		int num1 = Integer.parseInt(s1);
//		int num2 = Integer.parseInt(s2);
//		
//		if(num1>=num2) {
//			System.out.println(num1);
//		} else {
//			System.out.println(num2);
//		}
//		
//		in.close();
		
		/* Buffer 버전 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = br.readLine();
		st = new StringTokenizer(str, " ");
		String s1 = st.nextToken();
		String s2 = st.nextToken();

		StringBuffer sb1 = new StringBuffer(s1);
		s1 = sb1.reverse().toString();

		StringBuffer sb2 = new StringBuffer(s2);
		s2 = sb2.reverse().toString();
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		if(num1>=num2) {
			bw.write(num1+"\n");
		} else {
			bw.write(num2+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
