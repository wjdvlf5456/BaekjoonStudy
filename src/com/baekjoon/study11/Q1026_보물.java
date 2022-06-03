package com.baekjoon.study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026_보물 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// a,b 배열의 길이 'n'
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		//내림차순 정렬을 위해 Integer형으로 받음
		Integer[] b = new Integer[n];
		
		//a 배열의 값
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		//b 배열의 값 
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순 정렬
		Arrays.sort(a);
		
		//내림차순 정렬
		Arrays.sort(b,Collections.reverseOrder());
		
		int sum = 0;
		
		//a배열은 작은 값부터, b배열은 큰 값부터 입력해 곱해주기
		for (int i = 0; i < n; i++) {
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);
		
		br.close();
		
	}
}
