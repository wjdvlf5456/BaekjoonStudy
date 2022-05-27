package com.beakjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q15720_카우버거 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] set = new int[3];

		int[] burger = new int[Integer.parseInt(st.nextToken())];
		set[0] = burger.length;

		int[] side = new int[Integer.parseInt(st.nextToken())];
		set[1] = side.length;

		int[] drink = new int[Integer.parseInt(st.nextToken())];
		set[2] = drink.length;

		///////////////////////////////////////////////////////////////

		int sum = 0;

		// 각 버거, 사이드, 음료수 가격 지정
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < burger.length; i++) {
			burger[i] = Integer.parseInt(st.nextToken());
			sum += burger[i];
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < side.length; i++) {
			side[i] = Integer.parseInt(st.nextToken());
			sum += side[i];
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < drink.length; i++) {
			drink[i] = Integer.parseInt(st.nextToken());
			sum += drink[i];
		}

		System.out.println(sum);

		Arrays.sort(set);
		Arrays.sort(burger);
		Arrays.sort(side);
		Arrays.sort(set);

		int sumSet = 0;
		for (int i = 1; i <= set[0]; i++) {
			sumSet += burger[burger.length - i];
			sumSet += side[side.length - i];
			sumSet += drink[drink.length - i];

		}

		sumSet = (sumSet / 10) * 1;

		System.out.println(sum - sumSet);

		br.close();

	}

}
