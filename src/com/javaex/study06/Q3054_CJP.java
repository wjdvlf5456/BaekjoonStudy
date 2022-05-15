package com.javaex.study06;

import java.util.Scanner;

public class Q3054_CJP {

	public static void main(String[] args) {

		// 피터팬 프레임
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		String[] peter = new String[5];
		peter[0] = "..#.";
		peter[1] = ".#.#";
		peter[2] = ".#";
		peter[3] = ".#.#";
		peter[4] = "..#.";

		// 웬디프레임 --> 피터팬을 *로 바꿈
		String[] wendy = new String[5];
		for (int i = 0; i < wendy.length; i++) {
			wendy[i] = peter[i].replaceAll("#", "*");
		}

		for (int i = 0; i < peter.length; i++) {
			if (i == 2) {
				System.out.print("#");
			}

			for (int j = 0; j < word.length(); j++) {
				if (i == 2) {
					System.out.print("." + word.charAt(j));
				}
				// 3번째 글자마다 웬디 프레임 적용
				if (j % 3 == 2 || j % 3 == 1) {
					System.out.print(wendy[i]);

				} else {
					System.out.print(peter[i]);
				}
			}

			if (i == 2) {
				System.out.println("");

			} else {
				System.out.println(".");

			}
		}

		sc.close();

	}

}
