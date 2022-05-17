package com.javaex.study07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q5587_카드캡터상근이 {

	public static void main(String[] args) throws IOException {

		List<Integer> gList = new ArrayList<Integer>();
		List<Integer> sList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 각자 카드의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int card = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= card * 2; i++) {
			gList.add(i);
		}
		
		for (int i = 0; i < card; i++) {
			int san = Integer.parseInt(br.readLine());
			sList.add(i, san);
			
		}
		
		gList.removeAll(sList);
		System.out.println(sList.toString());
		System.out.println(gList.toString());
		
		
		
		
		

	}

}
