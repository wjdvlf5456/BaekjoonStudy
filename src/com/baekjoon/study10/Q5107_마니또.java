package com.baekjoon.study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q5107_마니또 {

	public static void main(String[] args) throws IOException {

		Map<String, String> pMap = new HashMap<String, String>();
		List<String> pList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int casecount = 1;

		// 0을 입력할 때까지 while문 반복
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int people = Integer.parseInt(st.nextToken());
			
			int count = 0;

			// 0 입력시 테스트케이스 종료
			if (people == 0) {
				break;

				// 0 아닐 경우 people수 만큼 두명 씩 입력하여 해쉬맵에 추가
			} else if (people >= 3 && people <= 20) {
				for (int i = 0; i < people; i++) {
					st = new StringTokenizer(br.readLine());
					String x = st.nextToken();
					String y = st.nextToken();

					pList.add(y);

					// 해쉬맵에 데이터 추가
					pMap.put(x, y);

				}

				int i = 0;
				String find = pList.get(i);
				// 연결고리수 찾기 while문 시작
				while (true) {
					if (pMap.containsKey(find) && pList.contains(find)) {
						pList.remove(find);		// 이번 키값의 밸류와 같은 리스트의 값 삭제
						find = pMap.get(find);	// 다음 차례에 올 키를 전 차례 키의 밸류값으로 전환

					} else if (pList.isEmpty()) {	// 리스트의 모든 값이 지워지면 멈추기
						count +=1;
						break;

					} else {	// 만약 리스트에서 해쉬맵의 키값과 일치하는 것이 없으면 find 리스트의 아무 값으로 초기
						find = pList.get(i);
						count += 1;
					}

				}


			}
			// 몇번째 케이스인지 + 공백 + 연결고리 수 출력
			System.out.println(casecount + " " + count);
			casecount++;
		}

		br.close();

	}

}
