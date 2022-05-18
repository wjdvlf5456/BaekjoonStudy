package com.baekjoon.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1713_SJW {

	// 후보 추천하기
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> peo = new ArrayList<String>();

		// 최종 후보 수
		int people = Integer.parseInt(br.readLine());

		// 출마후보 수
		int recommand = Integer.parseInt(br.readLine());

		// 출마 후보중 누구를 찍을 지
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 각 출마후보들
		int[] candidate = new int[recommand];

		for (int i = 0; i < recommand; i++) {
			candidate[Integer.parseInt(st.nextToken()) - 1]++;
			peo.add(st.nextToken());
			if (i > people) {
				peo.remove(i - people);
			}

		}
		for (String i : peo) {
			peo.toArray();
		}

	}

}
