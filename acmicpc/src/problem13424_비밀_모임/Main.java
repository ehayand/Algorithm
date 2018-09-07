package problem13424_비밀_모임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ehay@naver.com on 2018-07-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int INF = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] dp = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) dp[i][j] = 0;
                    else dp[i][j] = INF;
                }
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                int c = Integer.parseInt(st.nextToken());

                dp[a][b] = dp[b][a] = c;
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (dp[i][j] > dp[i][k] + dp[k][j]) {
                            dp[i][j] = dp[i][k] + dp[k][j];
                        }
                    }
                }
            }

            int k = Integer.parseInt(br.readLine());

            int[] friends = new int[k];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < k; i++) {
                friends[i] = Integer.parseInt(st.nextToken());
            }

            int[] dist = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    dist[i] = dist[i] + dp[friends[j] - 1][i];
                }
            }

            int ans = 0;
            int min = INF;

            for (int i = 0; i < n; i++) {
                if (dist[i] < min) {
                    ans = i;
                    min = dist[i];
                }
            }

            sb.append(ans + 1 + "\n");
        }

        System.out.print(sb.toString());
    }
}
