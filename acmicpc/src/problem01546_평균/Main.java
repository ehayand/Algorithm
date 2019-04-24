package problem01546_평균;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-04-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(temp[i]);
        }

        System.out.printf("%.2f", newAvg(score));
    }

    public static double newAvg(int[] score) {
        double sum = 0;
        double max = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) max = score[i];
            sum += score[i];
        }

        return sum / max * 100 / score.length;
    }
}