package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();

		String[] save = word.split("");

		for (int i = 0; i < save.length; i++) {
			if (i % 10 == 0 && i > 0) {
				bw.newLine();
			}
			bw.write(save[i]);

		}

		bw.close();

		br.close();

	}

}
