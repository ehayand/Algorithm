package level_04.jobs_052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2019-02-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp;

        int count = 0;
        boolean flag = false;
        int[][] bingo = new int[5][5];
        boolean[][] map = new boolean[5][5];
        List<Main.Point> points = new ArrayList();

        for (int i = 0; i < 26; i++)
            points.add(new Main.Point());

        for (int i = 0; i < 5; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(temp[j]);
                points.get(bingo[i][j]).x = i;
                points.get(bingo[i][j]).y = j;
            }
        }

        for (int i = 0; i < 5; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                count++;
                Main.Point p = points.get(Integer.parseInt(temp[j]));
                map[p.x][p.y] = true;

                if (count > 11) flag = check(map);
                if (flag) break;
            }
            if (flag) break;
        }

        System.out.println(count);
    }

    public static boolean check(final boolean[][] map) {
        int count = 0;

        boolean c = true;
        for (int i = 0; i < 5; i++) {
            if (!map[i][i]) {
                c = false;
                break;
            }
        }
        if (c) count++;

        c = true;
        for (int i = 0, j = 4; i < 5; i++, j--) {
            if (!map[i][j]) {
                c = false;
                break;
            }
        }
        if (c) count++;

        for (int i = 0; i < 5; i++) {
            boolean w, h;
            w = h = true;

            for (int j = 0; j < 5; j++) {
                if (!map[i][j]) {
                    w = false;
                    break;
                }
            }
            for (int j = 0; j < 5; j++) {
                if (!map[j][i]) {
                    h = false;
                    break;
                }
            }

            if (w) count++;
            if (h) count++;

            if (count > 2) return true;
        }

        return false;
    }

    static class Point {
        int x = 0;
        int y = 0;
    }
}
