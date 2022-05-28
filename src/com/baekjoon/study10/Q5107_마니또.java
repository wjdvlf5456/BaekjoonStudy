package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q5107_마니또 {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> iList = new HashMap<String, String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int casecount = 1;
		
		// 0을 입력할 때까지 while문 반복
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int people = Integer.parseInt(st.nextToken());
			
			// 0 입력시 테스트케이스 종료
			if (people == 0) {
				break;
				
			// 0 아닐 경우 people수 만큼 두명 씩 입력하여 해쉬맵에 추가
			} else {
				for (int i = 0; i < people; i++) {
					st = new StringTokenizer(br.readLine());
					iList.put(st.nextToken(), st.nextToken());
					
				}
				
				
				
			}
			//몇번째 케이스인지 + 공백 + 연결고리 수 출력
			System.out.println(casecount + " ");
			casecount++;
		}

		br.close();

	}

}
