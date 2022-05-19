package com.baekjoon.study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14912_숫자빈도수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// n까지 계산
		int n = Integer.parseInt(st.nextToken());

		String m = st.nextToken();
		char cm = m.charAt(0);

		// int값을 Stirng으로 변환해 받아오기
		String[] samenumber = new String[n];

		for (int i = 0; i < n; i++) {
			samenumber[i] = Integer.toString(i + 1);

		}
		int count = 0;

		for (int i = 0; i < samenumber.length; i++) {
			for (int j = 0; j < samenumber[i].length(); j++) {
				if (samenumber[i].charAt(j) == cm) {
					count++;

				}

			}

		}
		System.out.println(count);
		br.close();

	}

}
