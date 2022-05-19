package com.baekjoon.study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Q3054_CJP {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String frame = br.readLine();

		int tok = frame.length();
		String[] peter = new String[5];
		String[] wendy = new String[5];

		// 피터팬프레임 값
		peter[0] = "..#.";
		peter[1] = ".#.#";
		peter[2] = "#.";
		peter[3] = ".#.#";
		peter[4] = "..#.";

		// 웬디프레임 값
		for (int i = 0; i < 5; i++) {
			wendy[i] = peter[i].replace("#", "*");
		}

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < tok; j++) {
				// 세번째 줄 출력
				if (i == 2) {
					//3의 배수의 위치 앞뒤에 전부 웬디프레임 출력
					if (j % 3 != 1) {
						//처음은 무조건 피터팬프레임으로 시작
						if (j == 0) {
							System.out.print(peter[i] + frame.charAt(j) + ".");
						//그 이후 3의 배수의 위치마다 웬디프레임 출력
						} else {
							System.out.print(wendy[i] + frame.charAt(j) + ".");

						}
						//2,5,8...~번째에는 피터팬프레임 출력
					} else {
						System.out.print(peter[i] + frame.charAt(j) + ".");

					}
					//3번째 줄 마지막 값
					if (j == tok - 1 && frame.length() % 3 == 0) {
						System.out.print("*");
					} else if (j == tok - 1)
						System.out.print("#");
					
					//1,2,4,5번째 줄 출력
				} else {
					if (j % 3 == 2) {
						System.out.print(wendy[i]);
					} else {
						System.out.print(peter[i]);

					}

				}
			}
			//3번째 줄에는 공백으로 마무리
			if (i == 2) {
				System.out.println("");
			//나머지 줄은 .으로 마무리
			} else {
				System.out.println(".");

			}
		}

		br.close();

	}

}