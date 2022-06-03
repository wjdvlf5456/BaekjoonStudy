package com.baekjoon.study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q16943_숫자재배치 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int numA = Integer.parseInt(a);
		int numB = Integer.parseInt(b);
		
		//int형 배열로 각 자리숫자 저장
		String[] viewA = a.split("");
		String[] viewB = b.split("");
		
		int[] arrA = new int[viewA.length];
		int[] arrB = new int[viewB.length];
		//=============================================================
		
		for (int i = 0; i < a.length(); i++) {
			arrA[i] = Integer.parseInt(viewA[i]);			
			arrB[i] = Integer.parseInt(viewB[i]);			
		}
		
		Arrays.sort(arrA);

		if (numA >= numB) {
			System.out.println(-1);
		} else {
			int i = 0;
			

		}

		br.close();

	}

	public static void change(int number1, int temp, int number2) {

		temp = number1;
		number1 = number2;
		number2 = temp;

	}

}
