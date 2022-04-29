package com.baekjoon.study2;

import java.util.Scanner;

public class Q10988_SJW {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		int result = 0;

		// for조건문 시작
		for (int i = 0; i < word.length() / 2; i++) {
			int sum = 1;

			// if문 단어가 팰린드롬인지 판별하기
			if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
				sum = sum + i;

			} else {
				sum = 0;
			}

			// if문 맞은 횟수가 단어길이의 절반일 때 팰린드롬이라고 판별함
			if (sum >= word.length() / 2) {
				result = 1;
			}

		}
		// for조건문 끝
		System.out.println(result);

		sc.close();

	}

}
