package com.baekjoon.study02;

import java.util.Scanner;

public class Q10988_SJW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		int result = 0;

		// for조건문 시작
		for (int i = 0; i < word.length() / 2; i++) {
			int sum = 1;

			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				sum = sum + i;

			} else {
				sum = 0;
			}

			if (sum >= word.length() / 2) {
				result = 1;
			}
			//

		}
		// for조건문 끝
		System.out.println(result);

		sc.close();

	}

}
