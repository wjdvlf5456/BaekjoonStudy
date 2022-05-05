package com.baekjoon.study03;

import java.util.Scanner;

public class Q2578_LJH {

	public static void main(String[] args) {

		// 빙고
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] st = str.split(" ");
		int[] music = new int[st.length];

		String result = "";

		for (int i = 0; i < music.length; i++) {
			music[i] = i + 1;

			if (music[i] == Integer.parseInt(st[i])) {
				if (i == music.length - 1) {
					System.out.println("ascending");
				}

				continue;

			} else if (music[i] == Integer.parseInt(st[music.length - i - 1])) {
				if (i == music.length - 1) {
					System.out.println("descending");
				}
				continue;
			} else {
				System.out.println("mixed");
				break;
			}

		}
		System.out.println(result);

		sc.close();

	}

}
