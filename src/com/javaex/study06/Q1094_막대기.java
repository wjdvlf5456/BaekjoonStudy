package com.javaex.study06;

import java.util.Scanner;

public class Q1094_막대기 {

	public static void main(String[] args) {

		// 2진수로 나타낼 때 1일 몇개 인지
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int squa = 1;
		int sum = 0;

		while (x > 0) {
			sum = sum + squa * (x % 2);

			x = x / 2;
			squa *= 10;

		}
		String two = Integer.toString(sum);

		int count = 0;

		for (int i = 0; i < two.length(); i++) {
			if (two.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);

		sc.close();

	}

}
