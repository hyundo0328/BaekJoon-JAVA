package Baekjoon;

import java.util.Scanner;

public class BJ25304 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int all_price = in.nextInt();
		int num = in.nextInt();
		int sum = 0;
		
		
		for(int i=1;i<=num;i++) {
			int price = in.nextInt();
			int count = in.nextInt();
			
			sum += price*count;
		}
		
		if(sum == all_price) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		in.close();
	}

}
