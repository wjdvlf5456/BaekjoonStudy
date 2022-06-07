package com.baekjoon.study12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4289_가위바위보 {

	public static void main(String[] args) throws IOException {

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
				int p1 = Integer.parseInt(st.nextToken());

				String p1w = st.nextToken();

				int p2 = Integer.parseInt(st.nextToken());

				String p2w = st.nextToken();
				if (p1w.equals("rock")) {
					
				} else if(p1w.equals("scissors")){
					
				} else if(p1w.equals("paper")) {
					
				}
				
			}

		}

		br.close();

	}

}
