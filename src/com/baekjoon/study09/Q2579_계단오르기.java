package com.baekjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2579_계단오르기 {

	public static void main(String[] args) throws IOException {

		List<Integer> iList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int stairs = Integer.parseInt(br.readLine());

		for (int i = 0; i < stairs; i++) {
			iList.add(Integer.parseInt(br.readLine()));
		}

		int sum = 0;

		for (int i = 0; i < iList.size() - 1; i++) {
			sum += iList.get(i);
		}

		br.close();
	}

}
