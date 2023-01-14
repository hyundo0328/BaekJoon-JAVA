package Baekjoon;

import java.util.Scanner;

public class BJ2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		int time = in.nextInt();
		int plus;
		
		if (minute+time>=60) {
			plus = (minute+time)/60;
			if(hour+plus>=24) {
				System.out.print((hour+plus-24)+" ");
			} else {
				System.out.print((hour+plus)+" ");
			}
			System.out.println(minute+time-plus*60);
		} else {
			System.out.println(hour + " " + (minute+time));
		}
		
		in.close();
	}

}
