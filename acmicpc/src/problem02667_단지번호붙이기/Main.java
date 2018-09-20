package problem02667_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-09-20
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static boolean[][] map;
    static boolean[][] visit;
    static int n, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        map = new boolean[n][n];
        visit = new boolean[n][n];

        List<Integer> counts = new ArrayList();
        char[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                if (temp[j] == 49) map[i][j] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if (map[i][j] && !visit[i][j]) {
                    dfs(i, j);
                    counts.add(count);
                }
            }
        }

        counts.sort(Integer::compareTo);

        sb.append(counts.size()).append("\n");

        for (Integer i : counts) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;
        count++;

        if (x < n - 1) {
            if (map[x + 1][y] && !visit[x + 1][y]) dfs(x + 1, y);
        }

        if (x > 0) {
            if (map[x - 1][y] && !visit[x - 1][y]) dfs(x - 1, y);
        }

        if (y < n - 1) {
            if (map[x][y + 1] && !visit[x][y + 1]) dfs(x, y + 1);
        }

        if (y > 0) {
            if (map[x][y - 1] && !visit[x][y - 1]) dfs(x, y - 1);
        }
    }
}
