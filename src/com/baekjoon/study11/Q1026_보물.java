package com.baekjoon.study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026_보물 {
	public static void main(String[] args) throws IOException {

		/*
		옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
		길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
		S = A[0] × B[0] + ... + A[N-1] × B[N-1]
		S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
		S의 최솟값을 출력하는 프로그램을 작성하시오.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// a,b 배열의 길이 'n'
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] a = new int[n];
		// 내림차순 정렬을 위해 Integer형으로 받음
		Integer[] b = new Integer[n];

		// a 배열의 값
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		// b 배열의 값
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		// 오름차순 정렬
		Arrays.sort(a);

		// 내림차순 정렬
		Arrays.sort(b, Collections.reverseOrder());

		int sum = 0;

		// a배열은 작은 값부터, b배열은 큰 값부터 입력해 곱해주기
		for (int i = 0; i < n; i++) {
			sum += a[i] * b[i];
		}

		System.out.println(sum);

		br.close();

	}
}
