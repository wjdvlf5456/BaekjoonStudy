package com.javaex.study06;

import java.util.Scanner;

public class Q3054_CJP {

	public static void main(String[] args) {

		// 피터팬 프레임
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		String[] peter = new String[5];

		peter[0] = "..#..";
		peter[1] = ".#.#.";
		peter[2] = "#." + word + ".#";
		peter[3] = ".#.#.";
		peter[4] = "..#..";

		for (int i = 0; i < peter.length; i++) {
			System.out.println(peter[i]);
		}

		sc.close();

	}

}
