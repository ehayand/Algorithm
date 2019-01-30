package level_02.jobs_034;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-30
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        int[][] arr = new int[n][m];

        int num = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = num++;

        for (int[] i : arr) {
            for (int j : i)
                sb.append(j).append(" ");
            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
