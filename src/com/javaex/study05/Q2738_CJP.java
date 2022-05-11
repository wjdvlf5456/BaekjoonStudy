package com.javaex.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738_CJP {

	// 행렬 덧셈
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n과 m의 값 지정
		String str = br.readLine();

		// 공백으로 구분
		StringTokenizer st = new StringTokenizer(str);

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] nPro = new int[n][m];
		int[][] mPro = new int[n][m];

		// 위에 있는 for문에 한 줄로 받게 하고 안에 있는 for문을 토큰으로 구분하여 값을 넣어준다.
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				nPro[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				mPro[i][j] = Integer.parseInt(st.nextToken());

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				System.out.print(nPro[i][j] + mPro[i][j] + " ");

			}
			System.out.println("");

		}

		br.close();

	}
}

// Scanner sc = new Scanner(System.in);
//
// int n = sc.nextInt();
// int m = sc.nextInt();
//
// // 서로 다른 두 2차원 배열
// int[][] pro = new int[n][m];
// int[][] take = new int[n][m];
//
// // pro배열 값 넣기
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// pro[i][j] = sc.nextInt();
// }
// }
//
// // take배열 값 넣기
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// take[i][j] = sc.nextInt();
// }
// }
//
// // 두 배열의 합 출력
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// System.out.print(pro[i][j] + take[i][j] + " ");
// }
// System.out.println("");
// }
//
// sc.close();
//
// }