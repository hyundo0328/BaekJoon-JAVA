package Baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		double A = in.nextInt();
		double B = in.nextInt();
		
		System.out.println(String.format("%.9f", A/B));
 
		in.close();
	}

}
