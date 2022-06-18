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
				topWidth(nStr, s, n);
				break;

			case 1:
				for (int j = 0; j < s; j++) {
					System.out.println(topHeight(nStr, s, n));
					
				}
				break;

			case 2:
				midWidth(nStr, s, n);
				break;

			case 3:
				for (int j = 0; j < s; j++) {
					System.out.println(undHeight(nStr, s, n));
				}

				break;

			default:
				botWidth(nStr, s, n);
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

	// i==0, 맨 위의 줄 출력
	public static void topWidth(String nStr, int s, int n) {
		String wLine = "";
		for (int i = 0; i < n; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));
			wLine += " ";

			switch (nString) {
			case 1:
			case 4:
				wLine += space(s);
				break;

			default:
				wLine += width(s);
				break;
			}
			wLine += "  ";
		}
		System.out.print(wLine);
	}

	// i==0, 맨 위의 줄 출력
	public static void midWidth(String nStr, int s, int n) {
		String wLine = "";
		for (int i = 0; i < n; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));
			wLine += " ";

			switch (nString) {
			case 1:
			case 7:
			case 0:
				wLine += space(s);
				break;

			default:
				wLine += width(s);
				break;
			}
			wLine += "  ";
		}
		System.out.print(wLine);
	}

	// i==0, 맨 위의 줄 출력
	public static void botWidth(String nStr, int s, int n) {
		String wLine = "";
		for (int i = 0; i < n; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));
			wLine += " ";

			switch (nString) {
			case 1:
			case 4:
			case 7:
				wLine += space(s);
				break;

			default:
				wLine += width(s);
				break;
			}
			wLine += "  ";
		}
		System.out.print(wLine);
	}

	public static String width(int s) {	// s만큼 '-'를 출력하는 함수
		String wid = "";
		for (int i = 0; i < s; i++) {
			wid += "-";
		}

		return wid;

	}

	public static String topHeight(String nStr, int s, int n) {	// 중간기준 위에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i <n; i++) {
			int nString = Integer.parseInt(subStr(nStr, i));

			switch (nString) {
			// '|'가 좌측에 있는 경우
			case 5:
			case 6:
				hLine += "|";
				hLine += space(s);
				hLine += " ";
				break;

			// '|'가 우측에 있는 경우
			case 1:
			case 2:
			case 3:
			case 7:
				hLine += space(s);
				hLine += " ";
				hLine += "|";
				break;

			// '|'가 양측에 있는 경우
			case 4:
			case 8:
			case 9:
			case 0:
				hLine += "|";
				hLine += space(s);
				hLine += "|";
				break;

			default:
				break;
			}
			hLine += " ";
		}
		return hLine;

	}

	public static String undHeight(String nStr, int s, int n) {	// 중간기준 아래에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i < n; i++) {
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
			hLine += " ";
		}
		return hLine;
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
