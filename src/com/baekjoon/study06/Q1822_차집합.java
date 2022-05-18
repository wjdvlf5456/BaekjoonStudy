package com.baekjoon.study06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1822_차집합 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> setA = new HashSet<String>();
		Set<String> setB = new HashSet<String>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int numberA = Integer.parseInt(st.nextToken());
		int numberB = Integer.parseInt(st.nextToken());

		StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
		StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < numberA; i++) {
			setA.add(stA.nextToken());
		}

		for (int i = 0; i < numberB; i++) {
			setB.add(stB.nextToken());

		}
		
		setA.removeAll(setB);
		
		System.out.println(setA.size());
		
		
		for (int i = 0; i < setA.size(); i++) {
			
		}
		

	}
	
	public static void showInfo(Set<String>setA) throws IOException {
		
		
		
		
		
		
	}

}
