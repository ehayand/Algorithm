package problem01292_쉽게_푸는_문제;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-01
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        int sum = 0;
        int min = 0;
        int count = b - a + 1;
        int[] dp = new int[46];

        for (int i = 1; i < 46; i++)
            dp[i] = dp[i - 1] + i;

        for (int i = 1; i < 46; i++) {
            if (dp[i] >= a) {
                min = i;
                break;
            }
        }

        int n = dp[min] - a + 1;

        while (count > 0) {
            for (; count > 0 && n > 0; n--, count--)
                sum += min;
            n = ++min;
        }

        System.out.println(sum);
    }
}
