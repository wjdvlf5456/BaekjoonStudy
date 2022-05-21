package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q1302_베스트셀러 {

	public static void main(String[] args) throws IOException {

		List<String> bList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			bList.add(br.readLine());
		}

		System.out.println(bList.toString());

		bList.sort(null);
		System.out.println(bList.toString());
		
		for (int i = 0; i < args.length; i++) {
		}
		

		br.close();
	}

}
