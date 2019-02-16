package level_04.jobs_053;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-16
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int c = Integer.parseInt(temp[0]);
        int r = Integer.parseInt(temp[1]);

        boolean[][] map = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < c; j++) {
                if (temp[j].charAt(0) == '1') map[i][j] = true;
            }
        }

        boolean flag;
        int x, y, max, depth;

        x = y = max = 0;

        for (int i = 0; i < c; i++) {
            depth = 0;
            for (int j = 0; j < r; j++) {
                if (!map[j][i]) depth++;
                if (map[j][i] || depth == r) {
                    if (max < depth) {
                        max = depth;
                        x = i;
                    }
                    break;
                }
            }

            if (max == r) break;
        }

        if (max > 3) {
            for (int i = max - 1; i >= 0; i--) {
                flag = false;
                for (int j = 0; j < c; j++) {
                    if (j == x) continue;
                    if (!map[i][j]) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) y++;
            }

            if (y != 0)
                System.out.println((x + 1) + " " + y);
            else
                System.out.println("0 0");
        } else
            System.out.println("0 0");
    }
}
