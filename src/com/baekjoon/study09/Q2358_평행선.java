package com.baekjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q2358_평행선 {

	public static void main(String[] args) throws IOException {

		Map<Integer, List<Integer>> xMap = new HashMap<Integer, List<Integer>>();
		Map<Integer, List<Integer>> yMap = new HashMap<Integer, List<Integer>>();
		List<Integer> xList = new ArrayList<Integer>();
		List<Integer> yList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 점의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		// 점의 좌표 지정
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// 이전에 있던 x이면 어레이리스트에 y값 추가
			if (xMap.containsKey(x)) {
				xList.add(y);
			} else {
				// 이전에 없던 x이면 새로운 키값으로 x 추가
				xMap.put(x, xList);
			}
			if (yMap.containsKey(y)) {
				yList.add(x);
			} else {
				// 이전에 없던 x이면 새로운 키값으로 x 추가
				yMap.put(y, yList);
			}

			xMap.put(x, xList);
			xMap.put(y, yList);

		}
		List<Integer> xkeyList = new ArrayList<Integer>();
		List<Integer> ykeyList = new ArrayList<Integer>();
		xkeyList.addAll(xMap.keySet());
		ykeyList.addAll(yMap.keySet());
		
		System.out.println(xkeyList.toString());
		System.out.println(ykeyList.toString());
		
		int sum = 0;

		for (int i = 0; i < xMap.size(); i++) {
			if (xMap.get(xkeyList.get(i)).size()>1) {
				sum += 1;
				System.out.println(xMap.get(xkeyList.get(i)).size());
				
			}
			
		}
		System.out.println("");
		for (int i = 0; i < yMap.size(); i++) {
			if (yMap.get(ykeyList.get(i)).size()>1) {
				sum += 1;
				System.out.println(yMap.get(ykeyList.get(i)).size());
				
			}
			
		}
		System.out.println(sum);
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer(br.readLine());

int n = Integer.parseInt(st.nextToken());



int[][] dot = new int[n][2];

for (int i = 0; i < n; i++) {
	st = new StringTokenizer(br.readLine());
	for (int j = 0; j < 2; j++) {
		dot[i][j] = Integer.parseInt(st.nextToken());
	}

}

int count = 0;

for (int i = 0; i < n; i++) {
	for (int j = i+1; j < n; j++) {
		if (dot[i][0]==dot[j][0]) {
			count++;
		}
			
	}
}

for (int i = 0; i < n; i++) {
	for (int j = i+1; j < n; j++) {
		if (dot[i][1]==dot[j][1]) {
			count++;
		}
		
	}
}

System.out.println(count);

br.close();
*/