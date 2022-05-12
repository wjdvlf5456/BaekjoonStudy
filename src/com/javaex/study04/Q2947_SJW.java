package com.javaex.study04;

import java.util.Scanner;

public class Q2947_SJW {

	public static void main(String[] args) {

		// 나무 조각
		Scanner sc = new Scanner(System.in);

		int[] nArray = new int[5];
		for (int i = 0; i < nArray.length; i++) {
			int number = sc.nextInt();
			nArray[i] = number;

		}

		boolean swapped = false;

		for (int j = 0; j < nArray.length - 1; j++) {

			if (nArray[j] > nArray[j + 1]) {

				swap(nArray, j, j + 1);
				swapped = true;
			}

			if (swapped == false) {
				break;
			}

			System.out.println(nArray[0] + " " + nArray[1] + " " + nArray[2] + " " + nArray[3] + " " + nArray[4]);
		}

		sc.close();

	}

	public static void swap(int[] nArray, int i, int j) {

		int temp = nArray[i];
		nArray[i] = nArray[j];
		nArray[j] = temp;

	}

}
//////////////////////////////////////////////////////////////////////////////

// 출처 : https://st-lab.tistory.com/195

// 버블정렬 예시
/*
public class Bubble_Sort {
	 
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다. 
				 *
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
*/