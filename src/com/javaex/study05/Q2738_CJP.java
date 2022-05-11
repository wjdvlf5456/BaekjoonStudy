package com.javaex.study05;

import java.util.Scanner;

public class Q2738_CJP {

	// 행렬 덧셈
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		// 서로 다른 두 2차원 배열
		int[][] pro = new int[n][m];
		int[][] take = new int[n][m];

		// pro배열 값 넣기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				pro[i][j] = sc.nextInt();
			}
		}

		// take배열 값 넣기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				take[i][j] = sc.nextInt();
			}
		}

		// 두 배열의 합 출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(pro[i][j] + take[i][j] + " ");
			}
			System.out.println("");
		}

		sc.close();

	}

}
