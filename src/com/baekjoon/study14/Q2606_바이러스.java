package com.baekjoon.study14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Q2606_바이러스 {

	public static void main(String[] args) throws IOException {

		Map<Integer, List<Integer>> nMap = new HashMap<Integer, List<Integer>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int nCase = Integer.parseInt(st.nextToken());

		for (int i = 0; i < nCase; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			List<Integer> nList = new ArrayList<Integer>();

			nList.add(y);
			if (nMap.containsKey(x)) {
				nList.addAll(nMap.get(x));
			}
			nMap.put(x, nList);
		}

		Set<Integer> nSet = new HashSet<Integer>();
		List<Integer> rList = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			
		}

		// 사이즈까지

		System.out.println(nMap.toString());

		br.close();

	}

}
