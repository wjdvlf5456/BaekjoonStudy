package com.baekjoon.study2;

import java.util.Scanner;

public class Q1057_CBS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int challenger = sc.nextInt();

		int kjm = sc.nextInt();
		int ihs = sc.nextInt();

		int round = 1;

		while (challenger / 2 >= 1) {
			// 둘이 같은 라운드에서 만나는 경우
			if ((1 + kjm + ihs) % 4 == 0 && (ihs - kjm == 1 || kjm - ihs == 1)) {

				if ((kjm / 2 == (ihs / 2) + 1) || ((kjm / 2) + 1 == ihs / 2)) {
					break;
				}
				continue;

			} else {
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
			}
			// 라운드가 진행될 때 마다 참가자는 절반으로 줄어든다.
			challenger = challenger / 2;
			round += 1;
		}
		System.out.println(round);

		sc.close();

	}

}
