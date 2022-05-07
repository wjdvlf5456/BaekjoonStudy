package com.javaex.study04;

import java.util.Scanner;

public class Q2506_CJP {

	public static void main(String[] args) {

		// 정수계산
		Scanner sc = new Scanner(System.in);

		// 문제 수
		int quest = sc.nextInt();

		// 맞았는지 틀렸는지 각 배열에 1과 0으로 구분
		int[] question = new int[quest];
		int sum = 0;

		int contin = 0;
		for (int i = 0; i < quest; i++) {
			question[i] = sc.nextInt();

			sum = sum + contin;

			if (question[i] == 1) {
				contin++;
			} else if (question[i] == 0) {
				contin = 0;
			}

		}
		System.out.println(sum);
		sc.close();

	}

}
