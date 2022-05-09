package com.javaex.study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// import java.util.Scanner;

public class Q2506_CJP {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String questString = br.readLine();

		int quest = Integer.parseInt(questString);

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int[] question = new int[quest];

		int sum = 0;

		int contin = 0;
		for (int i = 0; i < quest; i++) {
			question[i] = Integer.parseInt(st.nextToken());

			if (question[i] == 1) {

				contin++;
			} else if (question[i] == 0) {
				contin = 0;
			}
			sum = sum + contin;

		}
		System.out.println(sum);

	}

}

/*
// 정수계산
Scanner sc = new Scanner(System.in);

// 문제 수
int quest = sc.nextInt();

// 맞았는지 틀렸는지 각 배열에 1과 0으로 구분
int[] question = new int[quest];
int sum = 0;

int contin = 0;
for (int i = 0; i < quest; i++) {
	question[i] = sc.nextInt();
	
	sum = sum + contin;
	
	if (question[i] == 1) {
		contin++;
	} else if (question[i] == 0) {
		contin = 0;
	}
	
}
System.out.println(sum);
sc.close();*/