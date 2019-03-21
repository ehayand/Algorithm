package problem02563_색종이;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-03-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] map = new boolean[101][101];

        int x, y, minX, minY, maxX, maxY;
        minX = minY = 0;
        maxX = maxY = 100;

        String[] temp;

        while (n-- > 0) {
            temp = br.readLine().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[1]);

            if (minX > x) minX = x;
            else if (maxX < x) maxX = x;

            if (minY > y) minY = y;
            else if (maxY < y) maxY = y;

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (!map[i][j]) map[i][j] = true;
                }
            }
        }

        int count = 0;

        for (int i = minX; i <= maxX; i++)
            for (int j = minY; j <= maxY; j++)
                if (map[i][j]) count++;

        System.out.println(count);
    }
}
