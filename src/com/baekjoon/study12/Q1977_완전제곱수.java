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

		int newn = (int) (Math.round(Math.sqrt(n) * 100) / 100)+1;
		int newm = (int) (Math.round(Math.sqrt(m) * 100) / 100);
		if (Math.round(Math.sqrt(n))== Math.round(Math.sqrt(m))) {
			bw.write(String.valueOf(-1));
			
			bw.close();
			br.close();
		} else {
			bw.write(String.valueOf(newn * newn));
			
			for (int i = newn; i <= newm; i++) {
				sum += i * i;
				
			}
			bw.newLine();
			bw.write(String.valueOf(sum));
			
			bw.close();
			br.close();

		}

	}

}
