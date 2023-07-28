package com.alone.study01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2444_별찍기7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int space = n - 1;
		int count = 1;

		for (int i = n; i < 2 * n; i++) {

			for (int j = 0; j < space; j++) {
				bw.write(" ");
			}

			for (int j = 0; j < count; j++) {
				bw.write("*");
			}

			space--;
			count += 2;
			bw.newLine();

		}
		space += 2;
		count -= 4;

		for (int i = n; i < 2 * n - 1; i++) {

			for (int j = 0; j < space; j++) {
				bw.write(" ");
			}

			for (int j = 0; j < count; j++) {
				bw.write("*");
			}

			space++;
			count -= 2;
			bw.newLine();

		}

		bw.flush();
		bw.close();
		br.close();
	}

}
