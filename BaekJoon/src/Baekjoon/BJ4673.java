package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ4673 {
	
	/* 전역 변수 설정하는 방법
	 * 1. 변수 앞에 static을 추가하여 따로 객체생성 없이 다른 메소드에서 바로 사용가능 (남용하면 악영향 발생)
	 * 2. 메소드에서 객체를 생성하여 필요할 때마다 생성하여 호출 후 삭제 (저장 X) (방법 : 클래스명 이름 = new 클래스명();)
	*/
	static int checked[] = new int[10001];
	
	public static void self_num(int num) {
		int tmp = num;
		int sum = 0;
		
		// 셀프 넘버 : num + 각 자리의 수
		sum += num;
		while(tmp>0) {
			sum += tmp%10;
			tmp = tmp/10;
		}
		
		/* 메소드 종료방법
		 * 1. System.exit(0) : 프로그램을 아예 종료
		 * 2. return : 해당 메소드만 종료*/
		if(sum>10000||checked[sum]==1) {
			return;
		} else {
			//System.out.println(sum);
			checked[sum] = 1;	
			self_num(sum);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		for(int i=1;i<=10000;i++) {
			self_num(i);
		}
		
		for(int i=1;i<=10000;i++) {
			if(checked[i]==0) {
				bw.write(i+"\n");
			} else {
				continue;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
