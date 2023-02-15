package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BJ18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int count = Integer.parseInt(br.readLine());
//		ArrayList<Integer> stack = new ArrayList<>();
//		int front = 0;
//		// int back = -1;
//		
//		for(int i=0;i<count;i++) {
//			String str[] = br.readLine().split(" ");
//			String order = str[0];
//			if(str[0].equals("push")) {
//				int n = Integer.parseInt(str[1]);
//				// back++;
//				stack.add(n);
//			} else if(str[0].equals("pop")) {
//				if(stack.size()==0 || front>=stack.size()) {
//					bw.write("-1\n");
//				} else {
//					bw.write(stack.get(front)+"\n");
//					// stack.remove(front);
//					front++;
//				}
//			} else if(str[0].equals("size")) {
//				bw.write(stack.size()-front+"\n");
//			} else if(str[0].equals("empty")) {
//				if(stack.size()-front == 0) {
//					bw.write(1+"\n");
//				} else {
//					bw.write(0+"\n");
//				}
//			} else if(str[0].equals("front")) {
//				if(stack.size()==0 || front>=stack.size()) {
//					bw.write("-1\n");
//				} else {
//					bw.write(stack.get(front)+"\n");
//				}
//			} else if(str[0].equals("back")) {
//				if(stack.size()==0 || front>=stack.size()) {
//					bw.write("-1\n");
//				} else {
//					bw.write(stack.get(stack.size()-1)+"\n");
//				}
//			}
//		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		// Deque<Integer> qu = new ArrayDeque<>();
		
		int count = Integer.parseInt(br.readLine());
		// int n = 0;
		
		for(int i=0;i<count;i++) {
			String str[] = br.readLine().split(" ");
			String order = str[0];
			
			if(str[0].equals("push")) {
				int n = Integer.parseInt(str[1]);
				// back++;
				queue.offer(n);
				// queue.push는 앞으로 삽입
			} else if(str[0].equals("pop")) {
				if(queue.size()==0) {
					bw.write("-1\n");
				} else {
					bw.write(queue.poll()+"\n");
				}
			} else if(str[0].equals("size")) {
				bw.write(queue.size()+"\n");
			} else if(str[0].equals("empty")) {
				if(queue.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if(str[0].equals("front")) {
				if(queue.size()==0) {
					bw.write("-1\n");
				} else {
					bw.write(queue.peek()+"\n");
				}
			} else if(str[0].equals("back")) {
				if(queue.size()==0) {
					bw.write("-1\n");
				} else {
					bw.write(queue.getLast()+"\n");
				}
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}

