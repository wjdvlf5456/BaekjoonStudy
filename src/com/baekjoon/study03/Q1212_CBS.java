package com.baekjoon.study03;

import java.util.Scanner;

public class Q1212_CBS {

	public static void main(String[] args) {
		// 8진수 2진수
		Scanner sc = new Scanner(System.in);

		// 10진수로 입력
		String str = sc.nextLine();

		String[] strArray = str.split("");

		int squared = 1;

		int sum = 0;

		for (int i = 0; i < strArray.length; i++) {

			sum += squared * Integer.parseInt(strArray[strArray.length - i - 1]);

			squared *= 8;

		}
		System.out.println(sum);

		sc.close();

	}

}
