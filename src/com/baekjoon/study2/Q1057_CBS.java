package com.baekjoon.study2;

import java.util.Scanner;

public class Q1057_CBS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 라운드
		int round = sc.nextInt();

		// 김지민
		int kjm = sc.nextInt();
		// 임한수
		int ihs = sc.nextInt();

		boolean win = true;

		while (round / 2 < 1) {
			if (kjm % 2 == 1) {

			}

			round /= round / 2;
		}

		sc.close();

	}

}
