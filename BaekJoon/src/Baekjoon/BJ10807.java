package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 배열 안에 있는 값들 확인하기
		// System.out.println(Arrays.toString(arr)); 
		int find_num = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0;i<num;i++) {
			if(find_num == arr[i]) {
				count++;
			}
		}
		bw.write(count+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
