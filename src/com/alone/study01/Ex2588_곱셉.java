package com.alone.study01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2588_곱셉 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int up = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		String down = st.nextToken();

		String[] spt = down.split("");

		for (int i = spt.length - 1; i >= 0; i--) {
			int result = up * Integer.parseInt(spt[i]);
			bw.write(Integer.toString(result));
			bw.newLine();
		}
		
		bw.write(Integer.toString(up*Integer.parseInt(down)));

		bw.flush();
		bw.close();
		br.close();
	}
}
