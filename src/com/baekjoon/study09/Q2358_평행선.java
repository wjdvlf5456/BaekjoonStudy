package com.baekjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q2358_평행선 {

	public static void main(String[] args) throws IOException {

		Map<Integer, List<Integer>> xMap = new HashMap<Integer, List<Integer>>();
		Map<Integer, List<Integer>> yMap = new HashMap<Integer, List<Integer>>();
		
		List<Integer> xList = new ArrayList<Integer>();
		List<Integer> yList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 점의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		// 점의 좌표 지정
		if (n>=1 && n<=100000) {
			
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// 이전에 있던 x이면 어레이리스트에 value(y)값 추가
			if (xMap.containsKey(x)) {
				xList.add(y);
			} else {
				xList.add(y);
				xMap.put(x, xList);

			}

			// 이전에 있던 y이면 어레이리스트에 value(x)값 추가
			if (yMap.containsKey(y)) {
				yList.add(x);
			} else {
				yList.add(x);
				yMap.put(y, yList);

			}

		}

		List<Integer> xKeyList = new ArrayList<Integer>();
		List<Integer> yKeyList = new ArrayList<Integer>();
		
		
		xKeyList.addAll(xMap.keySet());
		yKeyList.addAll(yMap.keySet());

		int count = 0;

		if (xList.size() - xKeyList.size() > 0) {
			count += xKeyList.size();
		}
		if (yList.size() - yKeyList.size() > 0) {
			count += yKeyList.size();
		}

		System.out.println(count);
		}

	}
}
