package com.baekjoon.study02;

import java.util.Scanner;

public class Q10872_KJH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int multiply = 1;

		for (int i = 1; i <= number; i++) {
			multiply = multiply * i;

		}
		System.out.println(multiply);

		sc.close();

	}

}
