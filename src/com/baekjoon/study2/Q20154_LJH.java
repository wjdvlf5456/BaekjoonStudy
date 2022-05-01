package com.baekjoon.study2;

import java.util.Scanner;

public class Q20154_LJH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		String[] alphabet = new String[word.length()];
		
		char[] spelling = new char[word.length()];
		
		

		
		for (int i = 0; i < alphabet.length; i++) {
			spelling[i] = word.charAt(i);
			System.out.print(spelling[i]);
		}
		
		
		

		sc.close();

	}

}
