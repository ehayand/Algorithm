package problem10163_색종이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ehay@naver.com on 2019-02-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[101][101];
        int[] count = new int[n];

        for (int i = 0; i < 101; i++)
            Arrays.fill(map[i], -1);

        int x, y, w, h, maxX, maxY;

        maxX = maxY = 0;
        String[] temp;
        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            y = Integer.parseInt(temp[0]);
            x = Integer.parseInt(temp[1]);
            w = Integer.parseInt(temp[2]);
            h = Integer.parseInt(temp[3]);

            int j, k;
            j = k = 0;
            for (j = x; j < x + h; j++)
                for (k = y; k < y + w; k++)
                    map[j][k] = i;

            maxX = maxX < j ? j : maxX;
            maxY = maxY < k ? k : maxY;
        }

        for (int i = 0; i < maxX; i++)
            for (int j = 0; j < maxY; j++) {
                if (map[i][j] < 0) continue;
                count[map[i][j]]++;
            }

        for (int i : count)
            sb.append(i).append("\n");

        System.out.print(sb.toString());
    }
}
