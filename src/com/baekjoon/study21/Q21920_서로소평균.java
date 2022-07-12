package com.baekjoon.study21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q21920_서로소평균 {

	public static void main(String[] args) throws IOException {

		// 서로소: 최대공약수가 1인 두 자연수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		int x = Integer.parseInt(br.readLine());
		int count = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (x % a[i] == 0) {
				count++;
				sum += a[i];
				
			} else if (a[i] % x == 0) {
				count++;
				sum += a[i];
			}
		}
		int aSum = 0;

		for (int i = 0; i < n; i++) {
			aSum += a[i];
		}

		double result = (double)((double)(aSum - sum) / (double)(n - count));
		System.out.println(String.format("%.6f", result));

		br.close();

	}

}
