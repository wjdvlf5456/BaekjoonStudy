package com.baekjoon.study16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2290_LCDTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		String nStr = st.nextToken();

		int n = nStr.length();
		for (int i = 0; i < 5; i++) {

			switch (i) {
			case 0:

				break;

			case 1:
				for (int j = 0; j < s; j++) {
					topHeight(nStr, n);

				}

				break;

			case 2:

				break;

			case 3:
				for (int j = 0; j < s; j++) {

					undHeight(nStr, n);
				}

				break;

			default:

				break;
			}
			System.out.println("");

		}

		br.close();

	}

	public static String subStr(String nStr, int i) {

		nStr = nStr.substring(i, i + 1);

		return nStr;
	}

	public static void width(int s) {	// s만큼 '-'를 출력하는 함수

		for (int i = 0; i < s; i++) {
			System.out.print("-");
		}
	}

	public static void topHeight(String nStr, int n) {	// 중간기준 위에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i < n; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));

			switch (nString) {
			// '|'가 좌측에 있는 경우
			case 5:
			case 6:
				hLine += "|";
				hLine += space(n);
				hLine += " ";
				break;

			// '|'가 우측에 있는 경우
			case 1:
			case 2:
			case 3:
			case 7:
				hLine += space(n);
				hLine +=" ";
				hLine += "|";
				break;

			// '|'가 양측에 있는 경우
			case 4:
			case 8:
			case 9:
			case 0:
				hLine += "|";
				hLine += space(n);
				hLine += "|";
				break;

			default:
				break;
			}
			hLine+=" ";
		}
		System.out.print(hLine);

	}

	public static void undHeight(String nStr, int s) {	// 중간기준 아래에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i < s; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));

			switch (nString) {
			// '|'가 좌측에 있는 경우
			case 2:
				hLine += "|";
				hLine += space(s);	// --> space함수로 int s를 넘겨준다.
				hLine += " ";
				break;

			// '|'가 좌측에 있는 경우
			case 1:
			case 3:
			case 4:
			case 5:
			case 7:
			case 9:
				hLine += space(s);
				hLine += " ";
				hLine += "|";
				break;

			// '|'가 양측에 있는 경우
			case 6:
			case 8:
			case 0:
				hLine += "|";
				hLine += space(s);
				hLine += "|";
				break;

			default:
				break;
			}
			hLine+=" ";
		}
		System.out.print(hLine);
	}

	// int s 만큼 공백을 채워주는 함수
	public static String space(int s) {

		String hLine = "";

		for (int i = 0; i < s; i++) {
			hLine += " ";
		}
		return hLine;
	}

}
