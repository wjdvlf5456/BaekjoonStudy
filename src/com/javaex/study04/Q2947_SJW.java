package com.javaex.study04;

import java.util.Scanner;

public class Q2947_SJW {

	public static void main(String[] args) {

		// 나무 조각
		Scanner sc = new Scanner(System.in);

		int[] nArray = new int[5];
		for (int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			nArray[i] = number;

		}

		System.out.print(nArray[0] + " " + nArray[1] + " " + nArray[2] + " " + nArray[3] + " " + nArray[4]);

		sc.close();

	}

}
