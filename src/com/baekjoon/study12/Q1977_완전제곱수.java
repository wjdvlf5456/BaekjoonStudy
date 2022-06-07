package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1977_완전제곱수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 0;

		for (int i = n; i <= m; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				sum += i;
				if (min > 0) {

				} else if(min==0){
					min += i;
				}
			}

		}
		if (sum == 0) {
			bw.write(String.valueOf(-1));
		} else {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min));
		}

		bw.close();
		br.close();

	}

}
