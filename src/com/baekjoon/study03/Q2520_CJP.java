package com.baekjoon.study03;

import java.util.Scanner;

public class Q2520_CJP {

	public static void main(String[] args) {

		// 팬케이크 사랑
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] mat = str.split(" ");

		int[] material = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			material[i] = Integer.parseInt(mat[i]);
		}

		int dough = 1;

		while (true) {

			if ((material[0] / 8) * (material[1] / 8) * (material[2] / 4) * (material[3] / 1)
					* (material[4] / 9) == 0) {
				break;
			}
			material[0] -= 8;
			material[1] -= 8;
			material[2] -= 4;
			material[3] -= 1;
			material[4] -= 9;
			dough++;

		}

		dough = 16 * dough;

		String topp = sc.nextLine();

		String[] toppi = topp.split(" ");

		int[] topping = new int[toppi.length];

		for (int i = 0; i < toppi.length; i++) {
			topping[i] = Integer.parseInt(toppi[i]);
		}

		int sum = topping[0] / 1 + topping[1] / 30 + topping[2] / 25 + topping[3] / 10;
		if (sum <= dough) {
			System.out.println(sum);

		} else {
			System.out.println(dough);

		}

		sc.close();

	}

}
