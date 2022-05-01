package com.baekjoon.study2;

import java.util.Scanner;

public class Q1057_CBS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 라운드
		int challenger = sc.nextInt();

		// 김지민
		int kjm = sc.nextInt();
		// 임한수
		int ihs = sc.nextInt();

		int round = 1;

		while (challenger / 2 < 1) {

			if (kjm / 2 == (ihs / 2) + 1 || (kjm / 2) + 1 == ihs / 2) {
				break;
			}

			// 김지민의 다음라운드 번호
			if (kjm % 2 == 1) {
				kjm = (kjm / 2) + 1;
			} else {
				kjm = kjm / 2;
			}

			// 임한수의 다음라운드 번호
			if (ihs % 2 == 1) {
				ihs = (ihs / 2) + 1;
			} else {
				ihs = ihs / 2;

			}
			challenger = challenger / 2;
			round += 1;
			System.out.println("while문 속 round: " + round);
		}System.out.println(round);

		sc.close();

	}

}
