package com.baekjoon.study02;

import java.util.Scanner;

public class Q1057_CBS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int players = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		
		int round = 0;
		
		while(kim != lim) {
			players -= players / 2;
			kim -= kim / 2;
			lim -= lim / 2;
			round++;
		}
		
		
		System.out.println(round);
		
		sc.close();

	}

}
