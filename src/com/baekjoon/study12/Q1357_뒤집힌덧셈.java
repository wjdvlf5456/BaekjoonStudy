package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1357_뒤집힌덧셈 {

	public static void main(String[] args) throws IOException {
		/*
		어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다.
		Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자. 예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때,
		Rev(X) = 1이다.
		두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int result = rev(x) + rev(y);
		int result2 = rev(result);

		// int형 String으로 변환
		bw.write(String.valueOf(result2));

		bw.close();
		br.close();

	}

	// 숫자 역순으로
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
