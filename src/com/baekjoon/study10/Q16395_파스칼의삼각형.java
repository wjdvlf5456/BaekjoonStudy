package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q16395_파스칼의삼각형 {

	public static void main(String[] args) throws IOException {
		
		List<Integer[]> triangle = new ArrayList<Integer[]>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		
		System.out.println(triangle);
		int pascal[][] = new int[n][n];

		pascal[0][0] = 1;
		pascal[1][0] = 1;
		pascal[1][1] = 1;
		
		

		if (n < 2) {
			bw.write(pascal[n - 1][k - 1]);
			bw.flush();
		} else if(n <= 30 && n >=0){

			for (int i = 2; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						pascal[i][j] = 1;
					} else {

						pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];

					}
					if (i == n - 1 && j == k - 1) {
						String result = Integer.toString(pascal[n - 1][k - 1]);
						bw.write(result);
						bw.flush();
						break;
					}
				}
			}
		}

		bw.close();
		br.close();

	}

}
