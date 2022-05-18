package com.baekjoon.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q24039_CBS {

	// 2021은 무엇이 특별할까?
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());

		int[] p = new int[5];
		int count = 0;
		for (int i = 1; i < year; i++) {

			if (year / i > 1 && year % i == 0) {
				count++;

				System.out.println(i);

				if (count < 2) {
				}
			} else {

			}
		}

	}

}
