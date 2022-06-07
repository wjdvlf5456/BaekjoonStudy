package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		char[] word = st.nextToken().toCharArray();

		int i = 0;

		while (i < word.length) {
			if (i > 0 && i % 10 == 0) {
				System.out.println("");
			}
			System.out.print(word[i]);
			i++;
		}

		br.close();

	}

}
