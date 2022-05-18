package com.baekjoon.study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1834_나머지와몫이같은수 {

	public static void main(String[] args) throws IOException {
		
		//N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램을 작성하시오.
		//예를 들어 N=3일 때, 나머지와 몫이 모두 같은 자연수는 4와 8 두 개가 있으므로, 그 합은 12이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//구하고자 하는 수 n
		long n = Integer.parseInt(st.nextToken());
		long sum = 0;
		
		/*
		n이 3일 때 (n+1) + (2n+2) = 3n +3				--> 4, 8
		n이 4일 때 (n+1) + (2n+2) + (3n +3) = 6n + 6	--> 5, 10, 15
		
		 */
		
		for (int i = 1; i < n; i++) {
			sum = sum + (n * i + i);
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
