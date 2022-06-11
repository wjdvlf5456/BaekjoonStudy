package com.baekjoon.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1699_제곱수의합 {

	public static void main(String[] args) throws IOException {

		List<Integer> sqrList = new ArrayList<Integer>();
		List<Integer> getList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 주어진 자연수 N
		int n = Integer.parseInt(st.nextToken());

		int sqr = (int) Math.sqrt(n);

		for (int i = 1; i <= sqr; i++) {
			sqrList.add(i * i);

		}
		int count = 0;
		int i = 0;

		while (i < sqrList.size()) {
			if (sqrList.contains(n - sqrList.get(i)) || sqrList.get(i) == n) {
				getList.add(sqrList.get(i));
			} else {

			}
			i++;
		}
		System.out.println(sqrList.toString());
		System.out.println(getList.toString());

		br.close();

	}

}
