package com.javaex.study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q13335_트럭 {

	public static void main(String[] args) throws IOException {

		List<Integer> tList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 총 트럭의 수
		int n = Integer.parseInt(st.nextToken());

		// 다리길이
		int w = Integer.parseInt(st.nextToken());

		// 다리의 최대 하중
		int l = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int time = 0;

		for (int i = 0; i < n; i++) {
			tList.add(Integer.parseInt(st.nextToken()));
			if (tList.size() > w) {
				tList.remove(0);
				if (tList.stream().mapToInt(Integer::intValue).sum() > l) {
					time += w;
				} else {
					time++;

				}
			} else if (tList.stream().mapToInt(Integer::intValue).sum() > l) {
				tList.remove(0);
				time += w;
			} else {
				time++;
			}

		}
		System.out.println(time + w);

		br.close();

	}

}
