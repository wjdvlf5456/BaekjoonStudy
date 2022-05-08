package com.baekjoon.study03;

import java.util.Scanner;

public class Q2920_KJH {

	public static void main(String[] args) {

		// 음계

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] st = str.split(" ");
		int[] music = new int[st.length];

		for (int i = 0; i < music.length; i++) {
			music[i] = Integer.parseInt(st[i]);

		}

		sc.close();

	}

}
