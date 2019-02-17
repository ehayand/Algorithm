package problem11404_플로이드;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-17
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int INF = 1000001;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;
        int n, m, u, v, w;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = INF;
            }
            map[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");

            u = Integer.parseInt(temp[0]) - 1;
            v = Integer.parseInt(temp[1]) - 1;
            w = Integer.parseInt(temp[2]);

            if (map[u][v] > w) map[u][v] = w;
        }

        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (map[i][j] > map[i][k] + map[k][j]) map[i][j] = map[i][k] + map[k][j];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == INF) map[i][j] = 0;
                sb.append(map[i][j]).append(" ");
            }
            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
