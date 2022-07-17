package com.baekjoon.study21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2502_떡먹는호랑이 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[] dp = new int[10001];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}

		int m = 0;
		int n = 0;

		// b == m*dp[a-3] + n*dp[a-2];

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번: " + dp[i]);
		}

		if (dp[a - 3] + dp[a - 2] == b) {
			

		}

		br.close();

	}

}
