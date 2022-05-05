package com.baekjoon.study03;

import java.util.Scanner;

public class Q1212_CBS {

	public static void main(String[] args) {
		// 8진수 2진수
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] strArray = str.split("");

		int[] eight = new int[strArray.length];

		for (int i = 0, j = strArray.length - 1; i < strArray.length; i++, j--) {
			eight[i] = Integer.parseInt(strArray[j]);

		}

		sc.close();

	}

}
