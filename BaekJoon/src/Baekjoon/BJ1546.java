package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		float arr[] = new float[num];
		float sum = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = (float)tmp;
			if(tmp>max) {
				max = tmp;
			}
		}
		
		for(int i=0;i<num;i++) {
			arr[i] = (arr[i]/max)*100;
			sum += arr[i];
		}
		
		System.out.println(String.format("%.2f", sum/num));

		br.close();
		bw.flush();
		bw.close();
	}

}
