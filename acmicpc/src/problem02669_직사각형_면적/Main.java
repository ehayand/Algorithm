package problem02669_직사각형_면적;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-20
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp;

        boolean[][] map = new boolean[102][102];
        int[][] sq = new int[4][4];

        for (int i = 0; i < 4; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                sq[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int leftX, rightX, leftY, rightY;
        int minX, maxX, minY, maxY;
        minX = minY = 101;
        maxX = maxY = 0;

        for (int k = 0; k < 4; k++) {
            leftX = sq[k][0] + 1;
            if (minX > leftX) minX = leftX;

            leftY = sq[k][1] + 1;
            if (minY > leftY) minY = leftY;

            rightX = sq[k][2];
            if (maxX < rightX) maxX = rightX;

            rightY = sq[k][3];
            if (maxY < rightY) maxY = rightY;


            for (int i = leftX; i <= rightX; i++) {
                for (int j = leftY; j <= rightY; j++) {
                    map[j][i] = true;
                }
            }
        }

        int count = 0;

        for (int i = minY; i <= maxY; i++) {
            for (int j = minX; j <= maxX; j++) {
                if (map[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}
