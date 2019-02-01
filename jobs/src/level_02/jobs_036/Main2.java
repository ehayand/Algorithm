package level_02.jobs_036;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-01
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i, k = 0; j >= 0 && k < n; j--, k++) {
                arr[k][j] = num++;
            }
        }

        for (int[] i : arr) {
            for (int j : i)
                if (j > 0) sb.append(j).append(" ");
            sb.replace(sb.length() - 1, sb.length(), "\n");
        }

        System.out.print(sb.toString());
    }
}
