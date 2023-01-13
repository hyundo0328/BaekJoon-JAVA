package Baekjoon;

import java.util.Scanner;

public class BJ3003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int f = in.nextInt();
		
		System.out.println(String.format("%d %d %d %d %d %d",1-a,1-b,2-c,2-d,2-e,8-f));
	}

}
