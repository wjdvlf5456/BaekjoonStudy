package com.javaex.study04;

import java.util.Scanner;

public class Q1476_CBS {

	public static void main(String[] args) {

		// 날짜 계산
		Scanner sc = new Scanner(System.in);
		// earth, sun ,moon의 숫자 입력
		String str = sc.nextLine();
		String[] st = str.split(" ");

		int[] esm = new int[3];

		for (int i = 0; i < esm.length; i++) {
			esm[i] = Integer.parseInt(st[i]);
		}

		int year = 0;

		while (true) {

			year++;
			esm[0]--;
			esm[1]--;
			esm[2]--;

			// 모든 숫자를 하나씩 빼면서 나머지가 같을 때 멈춘다.
			if (esm[0] % 15 == esm[1] % 28 && esm[1] % 28 == esm[2] % 19 && esm[2] % 19 == esm[0] % 15) {
				break;
			}

		}

		System.out.println(year);

		sc.close();

	}

}
