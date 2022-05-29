package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q16395_파스칼의삼각형 {

	public static void main(String[] args) throws IOException {

		List<Integer[]> pascal = new ArrayList<Integer[]>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int k = Integer.parseInt(st.nextToken());

		// ==============================================================================
		/////////////// 삼각형 맨위 값 1로 지정
		pascal.add(new Integer[] { 1 });
		pascal.add(new Integer[] { 1, 1 });

		// 출력 예시
		/*
		System.out.println(pascal.get(0)[0]);
		System.out.println(pascal.get(1)[0]);
		System.out.println(pascal.get(1)[1]);
		*/

		// ===================================
		// 같은 표현
		/*
		int pascal[][] = new int[n][n];
		
		pascal[0][0] = 1;
		pascal[1][0] = 1;
		pascal[1][1] = 1;
		*/

		// ==============================================================================

		// 이미 지정해놓은 값이 있어 n이 2보다 작으면 1을 출력한다.
		if (n < 2) {
			System.out.println(pascal.get(n - 1)[k - 1]);
		} else if (n <= 30 && n >= 0) {

			for (int i = 2; i < n; i++) {
				// Integer 배열에 올릴 int배열 생성
				int[] box = new int[i + 1];

				for (int j = 0; j <= i; j++) {
					// 양쪽 끝은 항상 1
					if (j == 0 || j == i) {
						box[j] = 1;
						// 그 이외의 값은 이전의 부모값 2개를 합쳐서 int배열에 추가
					} else {
						box[j] = pascal.get(i - 1)[j - 1] + pascal.get(i - 1)[j];

					}
				}
				// int형 배열을 Integer배열로 바꿔준다.
				pascal.add(Arrays.stream(box).boxed().toArray(Integer[]::new));

			}
			// List에서 값 가져오기
			System.out.println(pascal.get(n - 1)[k - 1]);
		}

		br.close();

	}

}
