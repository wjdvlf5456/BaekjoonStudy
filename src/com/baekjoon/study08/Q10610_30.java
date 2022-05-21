package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q10610_30 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] thirty = br.readLine().split("");

		int[] n = new int[thirty.length];

		for (int i = 0; i < thirty.length; i++) {
			n[i] = Integer.parseInt(thirty[i]);

		}

		Arrays.sort(n);
		int[] nGet = new int[thirty.length];

		for (int i = n.length - 1, j = 0; i >= 0; i--, j++) {
			nGet[j] = n[i];
		}

		int sum = 0;

		for (int i = 0; i < nGet.length; i++) {
			if (nGet[nGet.length - 1] != 0) {
				System.out.println(-1);
				break;

			}
			sum = sum + nGet[i];
		}
		System.out.println(sum);
		if (sum % 3 == 0) {
			for (int j = 0; j < nGet.length; j++) {
				System.out.print(nGet[j]);
			}
		} else {
			System.out.println(-1);
		}

		br.close();
	}

}
