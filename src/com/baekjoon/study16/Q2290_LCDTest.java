package com.baekjoon.study16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

public class Q2290_LCDTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Writer bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// '-','|' 길이
		int s = Integer.parseInt(st.nextToken());
		// 출력하고 싶은 숫자
		String nStr = st.nextToken();

		// 숫자자리수
		int n = nStr.length();

		// 맨 위줄 s만큼 '-' 출력
		bw.write(topWidth(nStr, s, n));
		((BufferedWriter) bw).newLine();
		
		//s길이만큼 '|'가 내려가야 하니 newLine으로 줄바꿈
		for (int i = 0; i < s; i++) {
			bw.write(topHeight(nStr, s, n));
			((BufferedWriter) bw).newLine();
		}
		
		//가운데 '-' 출력
		bw.write(midWidth(nStr, s, n));
		((BufferedWriter) bw).newLine();

		//s길이만큼 '|'가 내려가야 하니 newLine으로 줄바꿈
		for (int i = 0; i < s; i++) {
			bw.write(undHeight(nStr, s, n));
			((BufferedWriter) bw).newLine();
		}
		
		// 맨 아래  '-' 
		bw.write(botWidth(nStr, s, n));
		
		//writer,reader 둘 다 닫아준다.
		bw.flush();
		bw.close();
		br.close();

	}

	// 서브스트링 static으로 정의
	public static String subStr(String nStr, int i) {

		nStr = nStr.substring(i, i + 1);

		return nStr;
	}

	// 맨 위의 줄 출력함수
	public static String topWidth(String nStr, int s, int n) {
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
			// 다음 숫자는 한칸 띄움
			wLine += "  ";
		}
		return wLine;
	}

	// 가운데 줄 출력
	public static String midWidth(String nStr, int s, int n) {
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
		return wLine;
	}

	// 맨 아래 줄 출력
	public static String botWidth(String nStr, int s, int n) {
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
			// 다음 숫자는 한칸 띄움
			wLine += "  ";
		}
		return wLine;
	}

	// s만큼 '-'를 더해주어 3가지 Width함수로 넘김
	public static String width(int s) {
		String wid = "";
		for (int i = 0; i < s; i++) {
			wid += "-";
		}
		return wid;
	}

	public static String topHeight(String nStr, int s, int n) {	// 중간기준 위에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i < n; i++) {
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
			// 다음 숫자는 한칸 띄움
			hLine += " ";
		}
		return hLine;

	}

	public static String undHeight(String nStr, int s, int n) {	// 중간기준 아래에 '|' 를 출력하는 함수

		String hLine = "";
		for (int i = 0; i < n; i++) {
			// n의 맨 앞자리부터 주어진 숫자가 무었인지 가져온다.
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
			// 다음 숫자는 한칸 띄움
			hLine += " ";
		}
		return hLine;
	}

	// int s 만큼 공백을 채워주는 함수
	public static String space(int s) {

		String spaceLine = "";

		for (int i = 0; i < s; i++) {
			spaceLine += " ";
		}
		//
		return spaceLine;
	}

}
