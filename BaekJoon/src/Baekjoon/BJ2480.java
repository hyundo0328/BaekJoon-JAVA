package Baekjoon;

import java.util.Scanner;

public class BJ2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[3];
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		int max = 0;

		for(int i=0;i<3;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}		
		
		if((arr[0]==arr[1])&&(arr[0]==arr[2])&&(arr[1]==arr[2])) {
			System.out.println(10000+max*1000); 
		} else if (arr[0]==arr[1]) { 
			System.out.println(1000+arr[0]*100); 
		} else if (arr[1]==arr[2]) {
			System.out.println(1000+arr[1]*100);
		} else if (arr[0]==arr[2]) {
			System.out.println(1000+arr[2]*100);
		} else {
			System.out.println(max*100); 
		}
		
		in.close();
	}

}
