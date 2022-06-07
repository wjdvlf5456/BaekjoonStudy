package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q14929_귀찮아 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int sum = 0;
		int dsum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int get = Integer.parseInt(st.nextToken());
			sum += get;

			dsum += get * get;

		}
		bw.write(String.valueOf((sum * sum - dsum) / 2));

		bw.flush();
		bw.close();
		br.close();
	}

}
