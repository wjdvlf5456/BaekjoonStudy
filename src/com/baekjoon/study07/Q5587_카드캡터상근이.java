package com.baekjoon.study07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q5587_카드캡터상근이 {

	/*
	* 1에서 2n까지의 정수가 쓰여진 총 2n개의 카드를 사용한다.
	* 카드를 2명이 n장씩 나눠가진다.
	* 
	* 다음 규칙에 따라 교대로 카드를 1장씩 낸다.
	*  놓여진 카드가 없다면 원하는 카드를 낼 수 있다.
	*  놓여진 카드가 있다면 마지막에 나온 카드보다 큰 숫자가 적힌 카드를 낼 수 있다.
	*  낼 카드가 없는 경우 상대의 차례가 된다. 이때, 자리에 나와있는 카드는 없어진다.
	*  
	* 게임은 카드가 아무 것도 놓여있지 않은 상태에서 시작한다.
	* 둘 중 한 명이라도 카드를 모두 사용하면 게임이 종료된다.
	* 게임 종료시 '상대방이 가지고 있는 카드의 수'를 점수로 획득한다.
	* 
	* 1번째 줄에는 n이 주어진다. (1 ≤ n ≤ 100)
	* 이후 n개의 줄에 상근이에게 주어지는 각 카드에 적힌 수가 주어진다. 
	* 즉, 1~2n중 나머지 카드는 근상이에게 주어진다.
	* 
	* 1번째 줄에 상근이의 점수를 출력하고, 2번째 줄에 근상이의 점수를 출력한다.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();   // 카드 개수 2n개

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();

		// n개의 숫자를 A에 추가하기
		for (int i = 1; i <= n; i++) {
			A.add(sc.nextInt());
		}

		// A에 포함되지 않은 나머지 숫자 B에 추가
		for (int i = 1; i <= 2 * n; i++) {
			if (A.contains(i) == false) {
				B.add(i);
			}
		}

		Collections.sort(A);
		Collections.sort(B);

		int game = A.get(0);   // 카드 내기
		A.remove(0);

		int a = 1;   // A가 낼 카드 개수(-1) : 0부터 n-1까지
		int b = 0;   // B가 낼 카드 개수(-1)

		while (true) {
			if (a == n || b == n) {   // A or B가 먼저 다 내고 이김
				System.out.println(n - b);   // A의 점수 : B가 남긴 카드 개수
				System.out.println(n - a);   // B의 점수 : A가 남긴 카드 개수
				break;
			} else {
				int i = 0;
				for (i = 0; i < B.size(); i++) {   // B가 낼 차례
					if (B.get(i) > game) {   // 마지막으로 냈던 카드 보다 높아지는 순간 (보다 큰 것 중에 작은 것)
						game = B.get(i);   // 그 숫자 카드를 내고
						B.remove(i);    // 낸 카드 제거
						b++;   // B가 낸 카드 개수 증가
						i = i + 100;   // 냈는지 확인용
						break;
					}// 낼 카드가 없으면 아무것도 안하고 턴 종료 > A턴
				}
				if (i > B.size()) {   // i가 더 크면 B가 카드를 낸 것
					int j = 0;
					for (j = 0; j < A.size(); j++) {   // A가 낼 차례
						if (A.get(j) > game) { // 낸 숫자보다 큰 카드 찾기
							game = A.get(j);   // 그 숫자 냅니다.
							A.remove(j);   // 낸 카드 제거
							a++;   // A가 낸 카드 개수 증가
						}
					}
				} else {   // B가 카드를 못냈었어
					game = A.get(0);   // A가 가진 가장 작은 수를 내
					A.remove(0);   // 낸 카드 제거
					a++;   // A가 낸 카드 개수 증가
				}
			}

		}
		sc.close();
	}
}