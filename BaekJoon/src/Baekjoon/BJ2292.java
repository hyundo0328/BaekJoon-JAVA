package Baekjoon;

import java.util.Scanner;

public class BJ2292 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		int sum = 1;
		
		if(num==1) {
			System.out.println(1);
		} else {
			while(sum<num) {
				sum += 6*count;
				count++;
				//System.out.println("sum : "+sum+" count : "+count);
			}
			System.out.println(count);
		}
		
		in.close();
	}

}
