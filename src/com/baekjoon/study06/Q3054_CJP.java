package com.baekjoon.study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3054_CJP {

	/* 
	 * "피터팬 프레임"은 단어를 다이아몬드 형태로 장식하는 것이다. 
	 * "웬디 프레임"은 피터팬 프레임과 유사하지만, 다이아몬드를 '*'로 만드는 것이다.  
	 *  
	 * 단어가 주어졌을 때, 3의 배수 위치(세 번째, 여섯 번째, 아홉번째, ...)에 있는 알파벳은 웬디 프레임으로, 나머지 알파벳은 피터팬 프레임으로 장식 
	 * 웬디 프레임과 피터팬 프레임이 겹칠 경우에는, 웬디 프레임 
	 *  
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strArr = str.split("");

		int n = strArr.length;        // 알파벳 개수
		int l = 4 * (n - 1) + 5;        // l=4n+1 등차수열 - 한 행 당 출력될 문자 개수

		int i;

		for (i = 1; i < l + 1; i++) {        // 첫번째 줄
			if ((i + 1) % 4 == 0) {        // 4k-1
				if ((i + 1) % 12 == 0) {        // 12k-1
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			} else {
				System.out.print(".");
			}
		}
		System.out.println("");

		for (i = 1; i < l + 1; i++) {        // 두번째 줄
			if (i % 2 == 0) {
				if ((i + 2) % 12 == 0 || (i) % 12 == 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			} else {
				System.out.print(".");
			}
		}
		System.out.println("");

		for (i = 1; i < l + 1; i++) {        // 세번째 줄
			if ((i + 3) % 4 == 0) {
				if (((i - 1) % 12 == 0 && i > 1) || (i + 3) % 12 == 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			} else if ((i + 1) % 4 == 0) {
				System.out.print(strArr[((i + 1) / 4) - 1]);
			} else {
				System.out.print(".");
			}
		}
		System.out.println("");

		for (i = 1; i < l + 1; i++) {        // 네번째 줄 = 두번째
			if (i % 2 == 0) {
				if ((i + 2) % 12 == 0 || (i) % 12 == 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			} else {
				System.out.print(".");
			}
		}
		System.out.println("");

		for (i = 1; i < l + 1; i++) {        // 다섯번째 줄 (=첫번째)
			if ((i + 1) % 4 == 0) {
				if ((i + 1) % 12 == 0) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			} else {
				System.out.print(".");
			}
		}
		System.out.println("");

		br.close();
	}
}