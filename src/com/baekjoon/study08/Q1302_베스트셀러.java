package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1302_베스트셀러 {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> bMap = new HashMap<String, Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 책 제목 입력횟수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		// 입력할 때 마다 해쉬맵에 데이터 추가
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			// 이전에 있던 키값이면 밸류를 1증가
			if (bMap.containsKey(str)) {
				int count = bMap.get(str);
				bMap.replace(str, count, count + 1);

			} else {
				// 이전에 없던 키값이면 밸류를 1로 설정 후 해쉬맵에 추가
				bMap.put(str, 1);

			}
		}

		// 키는 String으로 밸류는 Integer로 어레이리스트를 사용하여 나누어주었다.
		List<String> sList = new ArrayList<String>();
		List<Integer> bList = new ArrayList<Integer>();

		sList.addAll(bMap.keySet());
		bList.addAll(bMap.values());

		// 최대값
		int max = 0;

		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i) > max) {
				max = bList.get(i);
			}

		}
		// 최대값 입력 완료

		// 만약 밸류가 최대값보다 적으면 키값도 같이 삭제(삭제되면서 다음에 검사할 값도 배열순서에서 1 줄어들기때문에 i-- 추가)
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i) < max) {
				sList.remove(i);
				bList.remove(i);
				i--;
			} else {

			}
		}

		// 남은 책 제목 정렬
		sList.sort(null);

		// 맨 앞의 책 제목 출력
		System.out.println(sList.get(0));

		br.close();
	}

}
