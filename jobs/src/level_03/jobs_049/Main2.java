package level_03.jobs_049;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-10
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        temp = br.readLine().split(" ");
        int x = Integer.parseInt(temp[0]) - 1;
        int y = Integer.parseInt(temp[1]) - 1;

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < m; j++)
                map[i][j] = Integer.parseInt(temp[j]);
        }

        if (map[x][y] != 0) System.out.println("game over");
        else {
            int count = 0;

            if (y > 0)
                if (map[x][y - 1] != 0) count++;
            if (y < m - 1)
                if (map[x][y + 1] != 0) count++;

            if (x > 0) {
                if (map[x - 1][y] != 0) count++;
                if (y > 0)
                    if (map[x - 1][y - 1] != 0) count++;
                if (y < m - 1)
                    if (map[x - 1][y + 1] != 0) count++;
            }

            if (x < n - 1) {
                if (map[x + 1][y] != 0) count++;
                if (y > 0)
                    if (map[x + 1][y - 1] != 0) count++;
                if (y < m - 1)
                    if (map[x + 1][y + 1] != 0) count++;
            }

            System.out.println(count);
        }
    }
}
