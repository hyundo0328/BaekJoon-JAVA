package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BJ2164 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		ArrayList<Integer> queue = new ArrayList<>();
//		
//		for(int i=2;i<=num;i+=2) {
//			queue.add(i);
//		}
//		int tmp;
//		if(num%2==0) {
//			tmp = 0;
//			
//		} else {
//			tmp = 1;
//		}
//		int front = 0;
//		
//		while(queue.size() != 1) {
//			if(tmp%2 == 0) {
//				queue.remove(front);
//			} else {
//				int n = queue.remove(front);
//				
//				queue.add(n);
//			}
//			tmp++;
//		}
//		
//		bw.write(queue.get(0)+"\n");
//		
//		br.close();
//		bw.flush();
//		bw.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=num;i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		bw.write(queue.peek()+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
