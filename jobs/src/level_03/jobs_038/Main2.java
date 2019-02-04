package level_03.jobs_038;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-03
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp;

        final int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i > 0)
                    if (arr[i][j] >= arr[i - 1][j]) {
                        sb.append(arr[i][j]).append(" ");
                        continue;
                    }
                if (i < n - 1)
                    if (arr[i][j] >= arr[i + 1][j]) {
                        sb.append(arr[i][j]).append(" ");
                        continue;
                    }
                if (j > 0)
                    if (arr[i][j] >= arr[i][j - 1]) {
                        sb.append(arr[i][j]).append(" ");
                        continue;
                    }
                if (j < n - 1)
                    if (arr[i][j] >= arr[i][j + 1]) {
                        sb.append(arr[i][j]).append(" ");
                        continue;
                    }

                sb.append("* ");
            }

            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
