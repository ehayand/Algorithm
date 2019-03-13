package problem01010_다리_놓기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        long[][] dp = new long[30][30];

        for (int i = 0; i < 30; i++)
            dp[i][i] = 1;

        for (int i = 2; i < 30; i++)
            dp[1][i] = i;

        for (int i = 2; i < 30; i++) {
            for (int j = i + 1; j < 30; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
            }
        }

        String[] temp;
        while (t-- > 0) {
            temp = br.readLine().split(" ");

            sb.append(dp[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
