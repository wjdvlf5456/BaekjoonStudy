package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4949_균형잡힌세상 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] st = str.split("");
		for (int i = 0; i < st.length; i++) {
			System.out.println(str.indexOf("("));

		}

		br.close();

	}

}
