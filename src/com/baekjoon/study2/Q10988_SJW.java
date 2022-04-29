package com.baekjoon.study2;

import java.util.Scanner;

public class Q10988_SJW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		char[] alphabet = new char[word.length()];

		int result = 0;
		for (int i = 0; i < alphabet.length / 2; i++) {
			int sum = 1;

			if (alphabet[i] == alphabet[alphabet.length - 1 - i]) {
				sum = sum + i;
				System.out.println("if문 sum" + sum);
			}
			System.out.println("for문 sum " + sum);
			if (sum>=word.length()) {
				result=1;
				System.out.println("if문 속 result: " + result);
			}
			System.out.println("for문 result: " + result);

		}

		System.out.println(result);

		sc.close();

	}

}
