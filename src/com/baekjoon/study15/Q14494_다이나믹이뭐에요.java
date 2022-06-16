package com.baekjoon.study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14494_다이나믹이뭐에요 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] dynamic = new int[n][m];
		dynamic[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || j == 0) {
					dynamic[i][j] = 1;
				} else {
					dynamic[i][j] = dynamic[i - 1][j] + dynamic[i][j - 1] + dynamic[i - 1][j - 1];
				}
			}
		}

		System.out.println(dynamic[n - 1][m - 1]);

		br.close();
	}

}
