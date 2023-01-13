package Baekjoon;

import java.util.Scanner;

public class BJ2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int one = num1 * (num2%10);
		int ten = num1 * (num2/10%10);
		int baek = num1 * (num2/100%10);
		
		System.out.println(one);
		System.out.println(ten);
		System.out.println(baek);
		System.out.println(one+ten*10+baek*100);
	}

}
