package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10610_30 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] thirty = br.readLine().split("");

		int[] n = new int[thirty.length];

		for (int i = 0; i < thirty.length; i++) {
			n[i] = Integer.parseInt(thirty[i]);

		}

		Arrays.sort(n);

		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			if (n[0] != 0) {
				sum = -1;
				break;

			} else {
				sum = sum + n[i];
			}
		}

		// 각 자리의 수를 합쳐서 3의 배수이면 n도 3의 배수이니 나머지로 여부를 알아낸다.
		if (sum % 3 == 0) {
			for (int i = n.length - 1; i >= 0; i--) {
				System.out.print(n[i]);

			}
		} else {
			System.out.println(-1);
		}

		br.close();
	}

}
