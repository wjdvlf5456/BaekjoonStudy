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

		// n만큼의 길이를 가지는 수열
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		// a[]배열의 값들과 비교할 값 X
		int x = Integer.parseInt(br.readLine());

		double sum = 0;
		int numCnt = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 2; j <= a[i]; j++) {
				if (a[i] % j == 0 && x % j == 0) {
					// 최대공약수가 1이 아니면 카운트를 추가
					count++;
				}

			}
			// 카운트가 하나라도 있을 시 서로소가 아니라고 판단한다.
			if (count < 1) {
				sum += (double)a[i];
				numCnt++;
				//System.out.println("a[" + i + "]: " + a[i]);
			}

		}
		
		//System.out.println("X와 서로수인 수들의 합: " + sum);
		System.out.println(String.format("%.6f",sum/numCnt));

		// double result = (double)((double)(aSum - sum) / (double)(n - count));
		// System.out.println(String.format("%.6f", result));

		br.close();

	}

}
