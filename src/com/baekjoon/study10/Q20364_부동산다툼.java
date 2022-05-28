package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q20364_부동산다툼 {

	public static void main(String[] args) throws IOException {

		Map<Integer, Integer> landTree = new TreeMap<Integer, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int land = Integer.parseInt(st.nextToken());
		int duck = Integer.parseInt(st.nextToken());

		int i = land;

		while (i > 0) {
			landTree.put(i, i / 2);
			i--;
		}
		
		for (int j = 0; j < duck; j++) {
			st = new StringTokenizer(br.readLine());
			
			int allready = Integer.parseInt(st.nextToken());
			
			if (landTree.containsKey(allready)) {
				System.out.println(0);
				landTree.remove(allready);
			} else {

			}
			
			
		}
		
		System.out.println(landTree.toString());

		br.close();

	}

}
