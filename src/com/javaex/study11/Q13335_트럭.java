package com.javaex.study11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q13335_트럭 {

	public static void main(String[] args) throws IOException {
		
		
		List<Integer> tList=  new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 총 트럭의 수
		int n = Integer.parseInt(st.nextToken());

		// 다리길이
		int w = Integer.parseInt(st.nextToken());

		// 다리의 최대 하중
		int l = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int[] truck = new int[n];

		for (int i = 0; i < truck.length; i++) {
			truck[i] = Integer.parseInt(st.nextToken());
		}
		

		int time = 0;

		int i = 0;
		
		while (true) {
			if (i==n) {
				break;
			}
			int sum = 0;
			tList.add(truck[i]);
			for (int j = 0 ;j<tList.size(); j++) {
				sum += tList.get(j);
			}
			if (tList.size()>w) {
				tList.remove(tList.get(0));
				time++;
			} else if(sum>l) {
				tList.remove(tList.get(0));
				for (int j = tList.size(); j < w; j++) {
					tList.add(0);
					time++;
				}
			} else {

			}
			tList.add(0);
			tList.remove(tList.get(w-1));
			time++;
			i++;
			System.out.println("sum: "+sum);
		}
		System.out.println(time);
		br.close();

	}

}
