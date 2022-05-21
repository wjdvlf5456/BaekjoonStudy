package com.baekjoon.study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10828_스택 {

	public static void main(String[] args) throws IOException {

		List<Integer> nList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String order = st.nextToken();

			switch (order) {
			case "push":
				int oNumber = Integer.parseInt(st.nextToken());
				nList.add(oNumber);

				break;

			case "pop":
				if (nList.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(nList.get(nList.size() - 1));
					nList.remove(nList.size() - 1);

				}

				break;

			case "size":
				System.out.println(nList.size());

				break;

			case "empty":
				if (nList.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

				break;

			case "top":
				if (nList.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(nList.get(nList.size() - 1));
				}

				break;

			}
		}

		br.close();

	}

}
