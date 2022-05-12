package com.javaex.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q1717_LJH {

	// 집합의 표현

	public static void main(String[] args) throws IOException {

		List<String> arrayList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);
		// 집합의 수
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(str);
		for (int i = 0; i < n; i++) {

			arrayList.add(Integer.toString(i + 1));
			System.out.println(arrayList.get(i));

		}
		// 연산의 수
		int m = Integer.parseInt(st.nextToken());
		

		for (int i = 0; i < m; i++) {
			String number = br.readLine();
			String[] numb = number.split(" ");
			String a = numb[1];
			String b = numb[2];

			switch (number.charAt(0)) {
			case 0:
				

				break;
			case 1:
				if () {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				

				break;

			default:
				break;
			}

		}

	}

}
