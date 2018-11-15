package problem02579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-11-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] step = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = step[0];
        dp[1] = step[0] + step[1];
        dp[2] = step[2] + Math.max(dp[0], step[1]);

        for (int i = 3; i < n; i++) {
            dp[i] = step[i] + Math.max((step[i - 1] + dp[i - 3]), dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
