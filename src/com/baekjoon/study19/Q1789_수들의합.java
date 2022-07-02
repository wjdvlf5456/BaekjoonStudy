package com.baekjoon.study19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 사이트 경로:
 * https://www.acmicpc.net/problem/1789
 */
public class Q1789_수들의합 {

	public static void main(String[] args) throws IOException {
		
		//문제
		//서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
		
		//입력
		//첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
		
		//출력
		//첫째 줄에 자연수 N의 최댓값을 출력한다.
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//4,294,967,295까지가 범위이므로 long형 사용
		long s = Long.parseLong(st.nextToken());
		
		long sum = 0;
		
		//i는 s를 나타낼 수 있는 n의 합의 배열의 길이
		int i = 0;

		long n = 0;
		
		//1부터 n까지의 합을 구하여 만약에 합이 s보다 크면 멈춘다
		while (true) {
			//만약 s보다 sum이 커지면 멈춘 후 i가 이미 한 번 더해진 상태로 넘어오므로 -1을 하고
			//거기에 차이가 나는 만큼의 수를 배열에서 빼야하므로 크기가 -1 되어 i-2를 넣어준다.
			if (sum>s) {
				
				n=i-2;
				break;
			}
			sum += i;
			i++;
		}
		System.out.println(n);

		br.close();

	}

}
