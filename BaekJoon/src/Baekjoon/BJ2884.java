package Baekjoon;

import java.util.Scanner;

public class BJ2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		
		if(minute-45<0) {
			if(hour-1<0) {
				System.out.print("23 ");
			} else {
				System.out.print((hour-1)+" ");
			}
			System.out.println(60-(45-minute));
		} else {
			System.out.print(hour+" "+(minute-45));
		}
		
		in.close();
	}

}
