package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q20364_부동산다툼 {

	public static void main(String[] args) throws IOException {

		List<Integer> dList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int land = Integer.parseInt(st.nextToken());
		int duck = Integer.parseInt(st.nextToken());
		
			System.out.println(gogo(land));
		
		
		br.close();
	}

	public static long gogo(int land) {
		long result = 0;
		
		if (land <= 1) {
			return 1;
		} else {
			
			result = land * gogo(land*2);
			System.out.println(land);
			return result;
		}
		

	}
}