package com.javaex.study04;

import java.util.Scanner;

public class Q2506_CJP {

	public static void main(String[] args) {

		// 정수계산
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] st = str.split(" ");

		int[] question = new int[st.length];
		int sum = 0;

		int contin = 0;
		for (int i = 0; i < question.length; i++) {
			question[i] = Integer.parseInt(st[i]);
			sum = sum + contin;

			if (question[i] == 1) {
				contin++;
			} else if (question[i] == 0) {
				contin = 0;
			}

		}
		System.out.println(sum);
		sc.close();

	}

}
