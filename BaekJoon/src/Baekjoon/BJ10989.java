package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		// ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		// 배열을 사용할 때는 Arrays를 사용하여 sort를 하고 ArrayList를 사용할 때는 Collections를 사용하여 sort를 한다.
		// 단, Arrays.sort를 할 때는 dual-pivot Quick sort이어서 시간복잡도가 최악이 O(n^2)이므로 가장 좋은 방법은 아니다.
		
		for(int i=0;i<num;i++) {
			bw.write(arr[i]+"\n");
		}

//		// 수의 범위 (0 ~ 10000) 사실상 0은 제외
//        int[] cnt = new int[10001];
// 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 
//        int N = Integer.parseInt(br.readLine());
// 
//        for (int i = 0; i < N; i++) {
//            // 해당 인덱스의 값을 1 증가
//            cnt[Integer.parseInt(br.readLine())] ++;
//        }
// 
//        br.close();
// 
//        StringBuilder sb = new StringBuilder();
// 
//        // 0은 입력범위에서 없으므로 1부터 시작
//        for(int i = 1; i < 10001; i++){
//            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
//            while(cnt[i] > 0){
//                sb.append(i).append('\n');
//                cnt[i]--;
//            }
//        }
//        System.out.println(sb);
        
        br.close();
        bw.flush();
        bw.close();
	}

}
