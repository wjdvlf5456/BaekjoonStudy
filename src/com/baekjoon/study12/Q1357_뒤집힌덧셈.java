package com.baekjoon.study12;

import java.util.Scanner;

public class Q1357_뒤집힌덧셈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int result = rev(x) + rev(y);

		System.out.println(rev(result));

		sc.close();

	}

	public static int rev(int num) {
		int sum = 0;
		while (true) {
			sum += num % 10;
			num /= 10;
			if (num == 0) {
				break;
			}
			sum *= 10;
		}
		return num = sum;
	}

}
