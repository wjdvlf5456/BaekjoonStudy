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
				if (number >= a) {
					sum += i;
				}
				
				System.out.print("안쪽 i: " + i + "  ");
				System.out.println("안쪽 j: " + j);
				System.out.println("안쪽 number: " + number);
				System.out.println("");
			}
			System.out.print("안쪽 sum: " + sum + "  ");
			System.out.println("");

		}
		System.out.print("최종 sum: " + sum + "  ");
		System.out.println("최종 number: " + number);
		System.out.println("");

	}

}
