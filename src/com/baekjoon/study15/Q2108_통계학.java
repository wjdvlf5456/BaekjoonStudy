package com.baekjoon.study15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q2108_통계학 {

	public static void main(String[] args) throws IOException {

		Map<Integer, Integer> nMap = new HashMap<Integer, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 1;
			st = new StringTokenizer(br.readLine());
			num[i] = Integer.parseInt(st.nextToken());
			if (nMap.containsKey(num[i])) {
				nMap.put(num[i], nMap.get(num[i]) + 1);
			} else {
				nMap.put(num[i], count);

			}

		}

		double sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}

		System.out.println(Math.round(sum / n));

		Arrays.sort(num);
		System.out.println(num[n / 2]);

		System.out.println(num[n - 1] - num[0]);
		System.out.println(nMap.toString());
		System.out.println("");

		List<Integer> nList = new ArrayList<Integer>();
		nList.addAll(nMap.values());

		Integer[] nn = new Integer[nList.size()];

		for (int i = 0; i < nList.size(); i++) {
			nn[i] = nList.get(i);
		}

		Arrays.sort(nn, Collections.reverseOrder());

		if (nMap.containsValue(nn[0])) {
			System.out.println(nMap.containsValue(0));

		} else {

		}

		System.out.println(Arrays.toString(nn));

	}

}
