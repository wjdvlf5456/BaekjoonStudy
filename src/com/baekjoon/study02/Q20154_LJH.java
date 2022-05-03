package com.baekjoon.study02;

import java.util.Scanner;

public class Q20154_LJH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		String[] alphabet = new String[word.length()];

		char[] spelling = new char[word.length()];

		int sum = 0;
		for (int i = 0; i < alphabet.length; i++) {
			spelling[i] = word.charAt(i);

			if (spelling[i] == 'C' || spelling[i] == 'I' || spelling[i] == 'J' || spelling[i] == 'L'
					|| spelling[i] == 'O' || spelling[i] == 'S' || spelling[i] == 'U' || spelling[i] == 'V'
					|| spelling[i] == 'Z') {
				sum += 1;

			} else if (spelling[i] == 'B' || spelling[i] == 'D' || spelling[i] == 'P' || spelling[i] == 'Q'
					|| spelling[i] == 'R' || spelling[i] == 'T' || spelling[i] == 'W' || spelling[i] == 'X'
					|| spelling[i] == 'Y') {
				sum += 2;

			} else if (spelling[i] == 'A' || spelling[i] == 'E' || spelling[i] == 'F' || spelling[i] == 'G'
					|| spelling[i] == 'H' || spelling[i] == 'K' || spelling[i] == 'M' || spelling[i] == 'N') {
				sum += 3;

			}

		}

		if (sum > 10) {
			sum = sum % 10;
		}
		if (sum % 2 == 0) {
			System.out.println("You're the winner?");
		} else {
			System.out.println("I'm a winner!");

		}

		sc.close();

	}

}
