package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int arr[] = new int[10];
		int count = 0;
		
		for(int i=0;i<10;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken())%42;
		}
		
		for(int i=0;i<10;i++) {
			int tmp = arr[i];
			int flag = 0;
			for(int j=i+1;j<10;j++) {
				if(tmp == arr[j]) {
					flag = 1;
					continue;
				}
			}
			if(flag == 0) {
				count++;
			}
		}
		
		bw.write(count+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
