package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int C = Integer.parseInt(br.readLine());
		
		for(int i=0;i<C;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			float arr[] = new float[num];
			float sum = 0;
			float count = 0;
			
			for(int j=0;j<num;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			for(int k=0;k<num;k++) {
				if(arr[k]>(sum/num)) {
					count++;
				}
			}
			System.out.println(String.format("%.3f%%", count/(float)num*100));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
