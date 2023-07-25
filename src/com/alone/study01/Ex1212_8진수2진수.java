package com.alone.study01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Ex1212_8진수2진수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(br.readLine());

		int[] octal = new int[sb.length()];

		for (int i = 0; i < octal.length; i++) {
			octal[i] = Character.getNumericValue(sb.charAt(i));
		}

		int j = 0;

		StringBuilder sbb = new StringBuilder("");

		while (octal.length > j) {

			if (octal[j] > 3) {
				sbb.append("1");
				octal[j] -= 4;
			} else {
				sbb.append("0");
			}

			if (octal[j] > 1) {
				sbb.append("1");
				octal[j] -= 2;
			} else {
				sbb.append("0");
			}

			if (octal[j] > 0) {
				sbb.append("1");

			} else {
				sbb.append("0");

			}

			j++;
		}

		while (true) {
			if (sbb.charAt(0) == '0') {
				sbb.deleteCharAt(0);
			} else {
				break;

			}
		}

		bw.write(sbb.toString());

		bw.flush();
		bw.close();
		br.close();
	}

}