package com.beakjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2358_평행선 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		

		int[][] dot = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				dot[i][j] = Integer.parseInt(st.nextToken());
			}

		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (dot[i][0]==dot[j][0]) {
					count++;
				}
					
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (dot[i][1]==dot[j][1]) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);

		br.close();

	}

}
