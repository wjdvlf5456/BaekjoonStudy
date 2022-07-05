package com.baekjoon.study20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Q20291_파일정리 {

	public static void main(String[] args) throws IOException {
		
		
		//사전 순 출력용 TreeMap
		Map<String, Integer> fMap = new TreeMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//n개만큼 파일 추가
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			//서브스트링으로 마지막에 위치한 확장자만 가져오기
			String ext = str.substring(str.lastIndexOf("."));
			ext = ext.replace(".", "");
			
			//이전에 존재한 확장자면 개수 +1
			if (fMap.containsKey(ext)) {
				fMap.put(ext, fMap.get(ext) + 1);
			} else {
				fMap.put(ext, 1);
			}
		}
		
		for (String i : fMap.keySet()) {
			System.out.println(i + " " + fMap.get(i));
		};


		br.close();

	}

}
