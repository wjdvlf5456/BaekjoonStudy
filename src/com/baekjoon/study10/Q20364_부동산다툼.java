package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q20364_부동산다툼 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int land = Integer.parseInt(st.nextToken());
		int duck = Integer.parseInt(st.nextToken());

		int[] number = new int[duck];
		
		int second = 1;
		while (second<land) {
			second *=2;
		}
		number[0] = second/2;
		for (int i = 1; i < land;i++) {
			number[i] = number[0]/2;
			number[i+1] = number[0]+1;
			
		}
		
		
		
		
		for (int i = 0; i < duck; i++) {
			st = new StringTokenizer(br.readLine());
			number[i] = Integer.parseInt(st.nextToken());

		}

		br.close();

	}

}
