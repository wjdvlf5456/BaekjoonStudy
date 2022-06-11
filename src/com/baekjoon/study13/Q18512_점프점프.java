package com.baekjoon.study13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q18512_점프점프 {

	public static void main(String[] args) throws IOException {

		// 최초 시작점인 p1에 계속해서 x를 더한 값을 넣어줄 List 생성
		List<Integer> xList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());

		// x만큼 멀리뛰기하는 사람의 최초값 p1 index 0번으로 저장
		xList.add(p1);

		while (p1 <= 100000) {
			xList.add(p1);
			p1 += x;

		}
		int result = 0;
		// 다른 사람의 시작 지점에서 계속 y를 더해주며 만약 같은 값이 있으면 멈추고 출력
		while (p2 < 100000) {
			if (xList.contains(p2)) {
				result = p2;
				break;
			} else {
				result = -1;
			}

			p2 += y;
		}

		System.out.println(result);

		br.close();

	}

}
