package level_04.jobs_054;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-18
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {

    static int[][] map;
    static boolean[][] visit;
    static int c, r, k;
    static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        c = Integer.parseInt(temp[0]);
        r = Integer.parseInt(temp[1]);
        k = Integer.parseInt(br.readLine());

        max = c * r;

        if (k > max) System.out.println(0);
        else {
            int x = 0;
            int y = r - 1;

            if (k != 1) {
                map = new int[r][c];
                visit = new boolean[r][c];

                boolean flag = false;
                int padding = 0;
                int current = 0;

                map[y][x] = ++current;


                while (current < max) {
                    for (y -= 1; y >= padding; y--) {
                        map[y][x] = ++current;
                        if (current == k) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;

                    y++;
                    for (x += 1; x < c - padding; x++) {
                        map[y][x] = ++current;
                        if (current == k) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;

                    x--;
                    for (y += 1; y < r - padding; y++) {
                        map[y][x] = ++current;
                        if (current == k) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;

                    y--;
                    for (x -= 1; x > padding; x--) {
                        map[y][x] = ++current;
                        if (current == k) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;

                    x++;
                    padding++;
                }
            }

            System.out.println((x + 1) + " " + (r - y));
        }
    }
}
