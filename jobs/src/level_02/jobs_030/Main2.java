package level_02.jobs_030;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 10;

        int[][] cards = new int[2][N];
        String[] temp;

        for (int i = 0; i < 2; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < N; j++) cards[i][j] = Integer.parseInt(temp[j]);
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < N; i++) {
            if (cards[0][i] > cards[1][i]) a++;
            else if (cards[0][i] < cards[1][i]) b++;
        }

        System.out.println(a > b ? "A" : a < b ? "B" : "D");
    }
}
