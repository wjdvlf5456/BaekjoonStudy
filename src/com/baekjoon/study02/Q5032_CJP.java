package com.baekjoon.study02;

import java.util.Scanner;

public class Q5032_CJP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("병의 개수를 알아보자");

		// 가진 병의 개수
		System.out.print("가지고 있는 병의 개수: ");
		int bottle = sc.nextInt();

		// 발견한 병의 개수
		System.out.print("발견한 병의 개수: ");
		int find = sc.nextInt();

		// 새 거로 교환할 수 있는 빈병의 개수
		System.out.print("새거 하나와 동등한 빈병의 수: ");
		int need = sc.nextInt();

		int result = bottle + find;

		System.out.println("need: " + need);
		System.out.println("result: " + result);

		int sum = 0;
		while (true) {
			sum = sum + result / need;
			System.out.println("while문 sum: " + sum);

			result = result / need + result % need;		// 빈병도 포함
			System.out.println("result: " + result);

			if (result < need) {
				System.out.println("총 개수: " + sum);
				break;
			}

		}

		sc.close();

	}

}
