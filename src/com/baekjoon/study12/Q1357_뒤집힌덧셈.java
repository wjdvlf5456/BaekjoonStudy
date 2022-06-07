package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1357_뒤집힌덧셈 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int result = rev(x) + rev(y);
		int result2 = rev(result);
		
		//int형 String으로 변환
		bw.write(String.valueOf(result2));

		bw.close();
		br.close();

	}

	//숫자 역순으로
	public static int rev(int num) {
		
		int sum = 0;
		while (true) {
			sum += num % 10;
			num /= 10;
			if (num == 0) {
				break;
			}
			sum *= 10;
		}
		return num = sum;
	}

}
