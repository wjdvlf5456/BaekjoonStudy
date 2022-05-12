package com.baekjoon.study03;

import java.util.Scanner;

public class Q1417_SJW {

	public static void main(String[] args) {

		// 국회의원 선거
		Scanner sc = new Scanner(System.in);

		int candidate = sc.nextInt();
		int[] vote = new int[candidate];

		int sum = 0;

		for (int i = 0; i < candidate; i++) {
			vote[i] = sc.nextInt();

			sum = sum + vote[i];

		}
		int max = 0;

		// 필요한 유권자 수
		int need = 0;
		int majority = sum / candidate;

		while (true) {

			max--;
			for (int i : vote) {
				max = Math.max(i, max);
			}
			if (max == vote[0] && vote[0] > majority) {
				break;
			}

			need++;
			vote[0]++;

		}

		System.out.println(max);

		// 과반수

		System.out.println(need);

		sc.close();

	}

}
