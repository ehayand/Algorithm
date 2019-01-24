package problem11658_구간_합_구하기_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static int[][] fenwick, input;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        fenwick = new int[n + 1][n + 1];
        input = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                input[i][j] = Integer.parseInt(temp[j - 1]);
                update(i, j, input[i][j]);
            }
        }

        while (m-- > 0) {
            temp = br.readLine().split(" ");

            if ("1".equals(temp[0]))
                sb.append(query(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
                        Integer.parseInt(temp[3]), Integer.parseInt(temp[4]))).append("\n");
            else {
                int x = Integer.parseInt(temp[1]);
                int y = Integer.parseInt(temp[2]);
                int value = Integer.parseInt(temp[3]);
                update(x, y, value - input[x][y]);
                input[x][y] = value;
            }
        }

        System.out.print(sb.toString());
    }

    public static int query(int x, int y) {
        int sum = 0;

        for (; x > 0; x -= (x & (-x)))
            for (int j = y; j > 0; j -= (j & (-j)))
                sum += fenwick[x][j];

        return sum;
    }

    public static int query(int x1, int y1, int x2, int y2) {
        return query(x2, y2) - query(x1 - 1, y2) - query(x2, y1 - 1) + query(x1 - 1, y1 - 1);
    }

    public static void update(int x, int y, long value) {
        for (; x <= n; x += (x & (-x)))
            for (int j = y; j <= n; j += (j & (-j)))
                fenwick[x][j] += value;
    }
}
