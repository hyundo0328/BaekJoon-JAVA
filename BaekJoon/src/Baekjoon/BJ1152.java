package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1152 {

	public static void main(String[] args) throws IOException {
		/* Scanner 버전 */
//		Scanner in = new Scanner(System.in);
//
//		String str = in.nextLine();
//		int count = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==' ') {
//				if(i==str.length()-1) {
//					break;
//				}
//				count++;
//			}
//		}
//
//		if(str.charAt(0)==' ') {
//			count--;
//		}
//		count++;
//		System.out.println(count);
//		
//		in.close();
		
		/* Buffer 버전 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = br.readLine();
		
		st = new StringTokenizer(str, " ");
		bw.write(st.countTokens()+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
