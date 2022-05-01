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

		while (challenger / 2 > 1) {
			round += 1;
			System.out.println("while문 속 round: " + round);

			// 둘이 같은 라운드에서 만나는 경우
			if (kjm / 2 == (ihs / 2) + 1 || (kjm / 2) + 1 == ihs / 2) {

				// 도전자가 홀수면 라운드 하나를 더 가므로 -1을 해준다.
				if (challenger % 2 == 0) {
					System.out.println("만날 때 라운드" + round);
				} else {
					System.out.println("만날 때 라운드" + (round - 1));

				}
				break;
			} else {
				// 김지민의 다음라운드 번호
				if (kjm % 2 == 1) {
					kjm = (kjm / 2) + 1;
				} else {
					kjm = kjm / 2;
				}
				System.out.println("while 김지민:  " + kjm);

				// 임한수의 다음라운드 번호
				if (ihs % 2 == 1) {
					ihs = (ihs / 2) + 1;
				} else {
					ihs = ihs / 2;

				}
				System.out.println("while 임한수:  " + ihs);

			}

			// 라운드가 진행될 때 마다 참가자는 절반으로 줄어든다.
			challenger = challenger / 2;
			System.out.println("challenger: " + challenger);
		}

		// 대결하지 않으면 -1을 출력
		if (challenger == 0) {
			System.out.println(-1);
		}

		sc.close();

	}

}
