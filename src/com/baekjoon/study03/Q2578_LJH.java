package com.baekjoon.study03;

import java.util.Scanner;

public class Q2578_LJH {

	public static void main(String[] args) {

		// 빙고
		Scanner sc = new Scanner(System.in);

		int[] bingo = new int[25];
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			String str = sc.nextLine();

			for (int j = 0 + 5 * i; j < 5 + 5 * i; j++) {
				String[] st = str.split(" ");
				bingo[j] = Integer.parseInt(st[j]);

			}
		}
		System.out.println(bingo[4]);
		System.out.println(bingo[9]);
		System.out.println(bingo[14]);
		System.out.println(bingo[19]);
		System.out.println(bingo[24]);

		sc.close();
	}

}
