package Baekjoon;

import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=0;i<num;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
		}
		
		in.close();
	}

}
