package com.javaex.study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1292_쉽게푸는문제 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int number = 0;
		int sum = 0;

		for (int i = 1; i <= b; i++) {

			for (int j = 0; j < i; j++) {
				number += 1;
				// 번호가 a번째 가 되면 그때부터 i를 더하시오
				if (number >= a) {
					sum += i;

				}
				// 번호가 b번째가 되면 합산을 멈추고 출력하시오
				if (number == b) {
					System.out.println(sum);
					break;
				}

			}

		}
		br.close();

	}

}
