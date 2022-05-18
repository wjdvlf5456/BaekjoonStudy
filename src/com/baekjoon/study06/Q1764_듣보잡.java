package com.baekjoon.study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1764_듣보잡 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] none = new String[n];
		String[] mone = new String[m];

		for (int i = 0; i < n; i++) {
			none[i] = br.readLine();
		}

		for (int i = 0; i < m; i++) {
			mone[i] = br.readLine();
		}
		
		int count = 0;
		
		for (int i = 0; i < none.length; i++) {
			for (int j = 0; j < mone.length; j++) {
				if (none[i].equals(mone[j])) {
					System.out.println(mone[j]);
					
				}
			}
		}

	}

}
