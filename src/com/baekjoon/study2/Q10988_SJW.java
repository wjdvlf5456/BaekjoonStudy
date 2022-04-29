package com.baekjoon.study2;

import java.util.Scanner;

public class Q10988_SJW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		int result = 0;
		for (int i = 0; i < word.length() / 2; i++) {
			int sum = 1;

			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {

				sum = sum + i;
				System.out.println("if문 sum" + sum);
			} else {
				sum = 0;
			}

			System.out.println("for문 sum " + sum);
			if (sum >= word.length() / 2) {
				result = 1;
				System.out.println("if문 속 result: " + result);
			}
			System.out.println("for문 result: " + result);

		}

		System.out.println(result);

		sc.close();

	}

}
