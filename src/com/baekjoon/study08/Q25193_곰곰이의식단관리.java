package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25193_곰곰이의식단관리 {

	public static void main(String[] args) throws IOException {

		/*
		첫 번째 줄에 식단을 정할 일수 N(1 ≤ N ≤ 100000) 이 주어진다.
		두 번째 줄에 음식의 리스트인 길이 N의 문자열 S가 주어진다.
		문자열은 영어 대문자로만 이루어져 있다. S_i가 C인 경우, i번째 음식이 치킨이며, 그 외의 경우에는 다른 음식이다.
		이 때 곰곰이가 연속으로 치킨을 먹는 날의 최댓값의 최솟값을 구하여라.
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer nst = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(nst.nextToken());

		int notchicken = 1;

		String food = br.readLine();

		String[] dFood = food.split("");

		for (int i = 0; i < n; i++) {
			if (dFood[i].equals("C")) {
			} else {
				notchicken++;
			}

		}
		System.out.println(n / notchicken);
		br.close();
	}

}
