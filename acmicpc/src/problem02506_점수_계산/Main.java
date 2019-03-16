package problem02506_점수_계산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] score = new boolean[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            if (temp[i].charAt(0) == '1') score[i] = true;

        boolean flag = false;
        int point = 1;
        int count = 0;

        for (boolean b : score) {
            if (b) {
                if (flag) ++point;

                count += point;
                flag = true;
            } else {
                point = 1;
                flag = false;
            }
        }

        System.out.println(count);
    }
}
