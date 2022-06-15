package com.baekjoon.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16173_점프왕젤리 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[][] rec = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				rec[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rec[i][j] >= n) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("Hing");
		} else {
			
		}

		br.close();
	}

}
