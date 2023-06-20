package com.javaex.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18111_마인크래프트 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[][] earth = new int[n][m];
		

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				earth[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		double sum = 0;
		double eSize = 0.0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum += earth[i][j];
				
			}
		}
		
		eSize = sum/(n*m);
		
		int average = Integer.parseInt(String.format("%.0f", eSize));
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (earth[i][j] < average) {
					earth[i][j]++;
					b--;
				} else {

				}
				
				
			}
			
			
		}
		
		
		

		br.close();

	}

}
