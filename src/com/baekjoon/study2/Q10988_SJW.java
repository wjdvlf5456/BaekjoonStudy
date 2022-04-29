package com.baekjoon.study2;

import java.util.Scanner;

public class Q10988_SJW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		char[] alphabet = new char[word.length()];

		int result = 0;
		int sum = 0;
		for (int i = 0; i <= alphabet.length / 2; i++) {

			if (alphabet[i] == alphabet[alphabet.length - 1 - i]) {
				sum++;
			} else {
				break;
			}

		}
		System.out.println(result);

		sc.close();

	}

}
