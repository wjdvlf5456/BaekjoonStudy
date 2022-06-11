package com.baekjoon.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1699_제곱수의합 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 주어진 자연수 N
		int n = Integer.parseInt(st.nextToken());

		int count = 0;

		int sqr = (int) (Math.sqrt(n));
		n -= sqr * sqr;
		System.out.println(n);
		if (n == 0) {
			count = 1;
		} else if (n % 4 == 1 || n % 4 == 0) {
			count = 2;
		} else {
			count += 1 + n % 4;
		}

		System.out.println("결과: " + count);
		br.close();

	}

}
