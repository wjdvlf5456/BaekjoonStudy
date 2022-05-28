package com.baekjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q11866_요세푸스문제 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> jList = new ArrayList<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 사람의 수: n
		int n = Integer.parseInt(st.nextToken());
		// k 번째마다 지운다.
		int k = Integer.parseInt(st.nextToken());

		// 리스트에 값 추가
		for (int i = 0; i < n; i++) {
			jList.add(i + 1);
		}
		// 배열에 있는 값은 1이 많으니 따로 -1을 해준 i를 지정했다.
		int i = k - 1;
		System.out.print("<");
		while (true) {
			// 마지막 생존자가 있으면 멈춘다.
			if (jList.size() == 1) {
				System.out.println(jList.get(0) + ">");
				break;
			}
			// i번째 배열 삭제
			System.out.print(jList.get(i) + ", ");
			jList.remove(i);

			// 지울 때마다 사이즈가 줄어드니 순서도 1씩 줄여준다.
			i = i - 1;
			i += k;

			// 순서가 사이즈 이상이 되면 사이즈만큼 나누어 나머지를 순서로 반환받는다.
			if (i >= jList.size()) {
				i = i % jList.size();
			}
		}

		br.close();

	}

}
