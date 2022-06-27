package com.baekjoon.study17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q3078_좋은친구 {
	
	public static void main(String[] args) throws IOException {
		
		List<Integer> fList = new ArrayList<Integer>(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			fList.add(str.length());
		}
		
		int count = 0;
		for (int i = 0; i < fList.size(); i++) {
			for (int j = i+1; j < fList.size(); j++) {
				if (fList.get(i)==fList.get(j)) {
					if (j-i<=k) {
						count++;
					}

				}
			}
		}
		System.out.println(count);
		
		
		br.close();
		
	}

}
