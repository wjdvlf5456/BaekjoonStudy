package com.baekjoon.study18;

import java.util.Scanner;

public class Q9660_돌게임6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		if (n < (long) 1000000000000l) {

			int turn = 1;

			while (n > 0) {
				if (n >= 4) {
					n -= 4;
				} else if (n >= 3) {
					n -= 3;
				} else {
					n -= 1;
				}

				turn *= -1;
			}

			if (turn == 1) {
				System.out.println("CY");
			} else {
				System.out.println("SK");
			}
		}

		sc.close();

	}

}
