package com.alone.study01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10430_나머지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int first = (A + B) % C;
		int second = ((A % C) + (B % C)) % C;
		int third = (A * B) % C;
		int fourth = ((A % C) * (B % C)) % C;

		bw.write(Integer.toString(first));
		bw.newLine();
		bw.write(Integer.toString(second));
		bw.newLine();
		bw.write(Integer.toString(third));
		bw.newLine();
		bw.write(Integer.toString(fourth));
		bw.newLine();

		bw.flush();
		bw.close();
		br.close();

	}

}
