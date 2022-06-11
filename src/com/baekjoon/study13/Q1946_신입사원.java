package com.baekjoon.study13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1946_신입사원 {

	public static void main(String[] args) throws IOException {

		List<Integer> pList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int people = Integer.parseInt(st.nextToken());

		for (int i = 0; i < people; i++) {
			st = new StringTokenizer(br.readLine());

			int written = Integer.parseInt(st.nextToken());
			int practical = Integer.parseInt(st.nextToken());

			int sum = written + practical;

			if (sum <= people) {
				if (pList.contains(sum)) {
					continue;
				}
				pList.add(sum);

			}

		}

		System.out.println(pList.size());

		br.close();

	}

}
