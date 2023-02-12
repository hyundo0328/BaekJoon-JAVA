package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
   	 	
   	 	String[] arr = new String[num];
   	 	
   	 	for(int i =  0 ; i < num ; i++) {
   	 		arr[i] = br.readLine();
   	 	}
   	 	
   	 	// https://infodon.tistory.com/51
   	 	// https://st-lab.tistory.com/112
   	 	Arrays.sort(arr, new Comparator<String>() {
   	 		@Override // 이미 기존에 있는 Comparator에서 인터페이스로 정의되어있는 함수를 재정의하는 기술이다.
   	 		public int compare(String s1, String s2) {
   	 		if(s1.length() == s2.length()) {
   	 			return s1.compareTo(s2);
   	 		}else {
   	 			return s1.length() - s2.length();
   	 		}
   	 		
   	 	}
   	 	});
   
   	 	bw.write(arr[0]+"\n");
   	 	for(int i = 1; i < num; i++) {
	   		if (!arr[i].equals(arr[i - 1])) {
				bw.write(arr[i]+"\n");
			}
   	 	}
		
		br.close();
		bw.flush();
		bw.close();
	}

}