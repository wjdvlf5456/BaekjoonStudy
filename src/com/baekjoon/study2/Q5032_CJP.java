package com.baekjoon.study2;

import java.util.Scanner;

public class Q5032_CJP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 가진 병의 개수
		int bottle = sc.nextInt();

		// 발견한 병의 개수
		int find = sc.nextInt();

		// 새 거로 교환할 수 있는 빈병의 개수
		int need = sc.nextInt();

		int sum = 0;
		int result = bottle + find;

		while (result > 0) {
			sum += result / need;

			result = result / need + result % need;
		}
		System.out.println(sum);

		sc.close();

	}

}
