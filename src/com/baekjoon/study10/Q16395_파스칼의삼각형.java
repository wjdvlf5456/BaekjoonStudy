package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16395_파스칼의삼각형 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		int pascal[][] = new int[n][n];

		pascal[0][0] = 1;
		pascal[1][0] = 1;
		pascal[1][1] = 1;

		for (int i = 2; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					pascal[i][j] = 1;
				} else {

					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];

				}
			}
		}
		System.out.println(pascal[n - 1][k - 1]);

		br.close();

	}

}
