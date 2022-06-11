package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q4289_가위바위보 {

	public static void main(String[] args) throws IOException {

		Map<Integer, String> tMap = new HashMap<Integer, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				break;
			}
			int test = Integer.parseInt(st.nextToken());

			for (int i = 0; i < test; i++) {
				st = new StringTokenizer(br.readLine());
				
				//플레이어1
				int p1 = Integer.parseInt(st.nextToken());
				System.out.println(p1);
				String p1w = st.nextToken();
				System.out.println(p1w);
				
				tMap.put(p1, p1w);
				
				//플레이어2
				int p2 = Integer.parseInt(st.nextToken());
				String p2w = st.nextToken();
				tMap.put(p2, p2w);
				
				
				

			}

		}

		br.close();

	}

}
