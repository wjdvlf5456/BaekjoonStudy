package com.javaex.study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1032_KJH {

    public static void main(String[] args) throws IOException {

        // 명령 프롬포트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fileNumber = Integer.parseInt(st.nextToken());
        String[] files = new String[fileNumber];

        for (int i = 0; i < fileNumber; i++) {
            files[i] = br.readLine();
            System.out.println(files.length);
            System.out.println(files[i]);
        }
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < fileNumber; j++) {
                files[j].charAt(i);
            }
        }

        br.close();

    }

}