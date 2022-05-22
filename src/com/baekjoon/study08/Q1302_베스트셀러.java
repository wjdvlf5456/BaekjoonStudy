package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1302_베스트셀러 {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> bMap = new HashMap<String, Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (bMap.containsKey(str)) {
				int count = bMap.get(str);
				bMap.replace(str, count, count + 1);
			} else {
				bMap.put(str, 1);

			}
		}

		List<String> sList = new ArrayList<String>();
		List<Integer> bList = new ArrayList<Integer>();

		sList.addAll(bMap.keySet());
		bList.addAll(bMap.values());
		int max = 0;

		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i) > max) {
				max = bList.get(i);
			}

		}

		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i) < max) {
				sList.remove(i);
				bList.remove(i);
				i--;
			} else {

			}
		}
		sList.sort(null);

		System.out.println(sList.get(0));

		br.close();
	}

}
