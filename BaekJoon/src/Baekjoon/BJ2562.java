package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int max = 0, tmp=0;
		int arr[] = new int[9];
		for(int i=0;i<9;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if (max < arr[i]) {
				max = arr[i];
				tmp=i+1;
			}
		}
		bw.write(max+"\n"+tmp);
		
		br.close();
		bw.flush();
		bw.close();
	}

}
