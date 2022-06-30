package com.baekjoon.study17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1068_트리 {

	public static void main(String[] args) throws IOException {

		Map<Integer, List<Integer>> nMap = new HashMap<Integer, List<Integer>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int node = Integer.parseInt(st.nextToken());

		int[] tree = new int[node];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < node; i++) {
			tree[i] = Integer.parseInt(st.nextToken());

			List<Integer> nList = new ArrayList<Integer>();
			nList.add(i);
			if (nMap.containsKey(tree[i])) {
				nList.addAll(nMap.get(tree[i]));
			}
			nMap.put(tree[i], nList);

		}
		System.out.println(nMap.toString());

		br.close();

	}

}
