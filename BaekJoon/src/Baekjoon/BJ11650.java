package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
   	 	
   	 	int arr[][] = new int[num][2];
   	 	
   	 	for(int i =  0 ; i < num ; i++) {
   	 		String[] str = br.readLine().split(" "); // StringTokenizer 말고 찢는 방법
   	 		arr[i][0] = Integer.parseInt(str[0]);
   	 		arr[i][1] = Integer.parseInt(str[1]);
   	 	}
   	 	
   	 	// https://infodon.tistory.com/50
   	 	// 람다식 사용하는 이유 : 2차원 배열은 sort 메소드를 사용할 수 없다
   	 	// 람다식 : 익명 함수와 같다, 변수에 바로 함수를 적용하여 사용 (ex : int c = (int a, int b) -> {return a+b;}))
   	 	Arrays.sort(arr, (e1, e2) -> { // Arrays -> 배열에 사용, Collections -> ArrayList 객체에 사용 
   	 				// Comparator 비교 방식은 반환 값이 양수냐, 음수냐를 통해서 정렬을 해주는 방식입니다. 
   	 				// 즉 e1 [1] - e2 [1] 이 수가 양수가 된다면 e1이 더 큰 수가 될 것이고, 그 반대면 e2가 더 큰 수가 됩니다.
					if(e1[0] == e2[0]) {
						return e1[1] - e2[1];
					} else {
						return e1[0] - e2[0];
					}
				});
   	 	
   	 	for(int i = 0; i < num; i++) {
			bw.write(arr[i][0] + " " + arr[i][1]+"\n");
   	 	}

		br.close();
		bw.flush();
		bw.close();
	}

}
