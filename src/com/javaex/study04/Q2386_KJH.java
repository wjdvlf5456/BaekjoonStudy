package com.javaex.study04;

import java.util.Scanner;

public class Q2386_KJH {

	public static void main(String[] args) {

		// 도비의 영어 공부
		Scanner sc = new Scanner(System.in);
		while (true) {

			String str = sc.nextLine();
			String[] st = str.split("");
			if (st.length < 3) {
				break;
			}

			int count = 0;

			// 맨 앞 소문자 제외
			for (int i = 1; i < st.length; i++) {
				// 대문자 소문자 상관없이 비교
				if (st[i].equalsIgnoreCase(st[0])) {
					count++;
				}

			}
			System.out.println(count);
		}

		sc.close();
	}

}
