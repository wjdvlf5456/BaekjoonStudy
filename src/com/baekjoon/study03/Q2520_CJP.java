package com.baekjoon.study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2520_CJP {

	public static void main(String[] args) throws IOException {

		// 팬케이크 사랑
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);

		int[] material = new int[5];
		for (int i = 0; i < material.length; i++) {
			material[i] = Integer.parseInt(st.nextToken());

		}

		int dough = 0;

		while ((material[0] / 8) * (material[1] / 8) * (material[2] / 4) * (material[3] / 1) * (material[4] / 9) != 0) {

			material[0] -= 8;
			material[1] -= 8;
			material[2] -= 4;
			material[3] -= 1;
			material[4] -= 9;
			dough++;

		}

		dough = dough * 16;

		String toppingType = br.readLine();

		StringTokenizer tk = new StringTokenizer(toppingType);

		int[] topping = new int[4];
		for (int i = 0; i < topping.length; i++) {
			topping[i] = Integer.parseInt(tk.nextToken());
		}

		System.out.println(dough);

		int sum = (topping[0] / 1) + (topping[1] / 30) + (topping[2] / 25) + (topping[3] / 10);
		System.out.println(sum);
		if (dough > sum) {
			System.out.println(sum);

		} else {
			System.out.println(dough);

		}

		br.close();

	}

}
