package com.baekjoon.study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2520_CJP {

	public static void main(String[] args) throws IOException {

		// 팬케이크 사랑
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 테스트케이스
		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {

			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str);

			// 반죽재료
			int[] material = new int[5];
			for (int j = 0; j < material.length; j++) {
				material[j] = Integer.parseInt(st.nextToken());

			}

			int dough = 0;

			while ((material[0] / 8) * (material[1] / 8) * (material[2] / 4) * (material[3] / 1)
					* (material[4] / 9) != 0) {

				material[0] -= 8;
				material[1] -= 8;
				material[2] -= 4;
				material[3] -= 1;
				material[4] -= 9;
				dough++;

			}
			// 반죽 * 16
			dough = dough * 16;

			String toppingType = br.readLine();

			StringTokenizer tk = new StringTokenizer(toppingType);

			// 토핑개수
			int[] topping = new int[4];
			for (int j = 0; j < topping.length; j++) {
				topping[j] = Integer.parseInt(tk.nextToken());
			}

			int sum = (topping[0] / 1) + (topping[1] / 30) + (topping[2] / 25) + (topping[3] / 10);
			if (dough > sum) {
				System.out.println(sum);

			} else {
				System.out.println(dough);

			}
		}

		br.close();

	}

}
