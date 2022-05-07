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
		for (int i = 0; i < question.length; i++) {
			question[i] = Integer.parseInt(st[i]);
			sum = sum + i;
			if (question[i] == 0) {
				break;
			}

		}

		System.out.println(sum);

		sc.close();

	}

}
