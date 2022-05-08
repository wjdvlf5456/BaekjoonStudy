package com.baekjoon.study03;

import java.util.Scanner;

public class Q1212_CBS {

	public static void main(String[] args) {
		// 8진수 2진수
		Scanner sc = new Scanner(System.in);

		// 입력하고 싶은 진수의 숫자로 입력하나 현재 상태는 10진수이다.
		int number = sc.nextInt();

		// 몇 제곱인지 표현
		int squared = 1;

		int sum = 0;

		while (number > 0) {
			// 처음 입력받는 숫자는 10진수 이기 때문에 8진수를 10진수로 바꿔준다.
			sum = sum + squared * (number % 10);
			number = number / 10;

			// 8진수
			squared *= 8;
		}

		int two = 0;
		int x = 1;
		while (sum > 0) {
			// 2진수로 바꿈
			two = two + x * (sum % 2);
			sum = sum / 2;

			// sum은 10진수이니 제곱은 10으로 해줌
			x *= 10;
		}

		System.out.println(two);

		sc.close();

	}

}
