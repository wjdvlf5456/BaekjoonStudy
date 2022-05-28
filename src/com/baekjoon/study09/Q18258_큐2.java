package com.baekjoon.study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q18258_큐2 {

	public static void main(String[] args) throws IOException {

		List<Integer> iList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());

			if (st.nextToken().equals("push")) {
				iList.add(Integer.parseInt(st.nextToken()));

			} else if (st.nextToken().equals("pop")) {
				
				
			} else if (st.nextToken().equals("size")) {
				
				
			} else if (st.nextToken().equals("empty")) {
				
				
			} else if (st.nextToken().equals("front")) {
				
				
			} else if (st.nextToken().equals("back")) {

			} else {

			}

		}

		br.close();
	}

}
