package com.baekjoon.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1699_제곱수의합 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 주어진 자연수 N
		int m = Integer.parseInt(st.nextToken());
		
		// m만큼 모든 배열에 1을 부여한다.
		int[] nCase = new int[m];
		int sqr = (int) Math.sqrt(m);

		for (int i = 0; i < m; i++) {

			int n = m;
			int count = 0;
			sqr = (int) Math.sqrt(n) - i;
			for (int j = 1; j * j < m; j++) {
				n = n - sqr * sqr;
				sqr = (int) Math.sqrt(n);
				if (n == 0) {
					count++;
					break;

				}
				count++;
			}
			nCase[i] = count;
		}
		Arrays.sort(nCase);

		System.out.println(nCase[0]);

		br.close();

	}

}
