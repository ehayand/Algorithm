package problem06603_로또;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-09-22
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static StringBuilder sb;
    static int k;
    static int[] numbers;
    static int[] ans = new int[6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String[] temp;

        while (true) {
            temp = br.readLine().split(" ");
            k = Integer.parseInt(temp[0]);

            if (k == 0) break;

            numbers = new int[k];

            for (int i = 0; i < k; i++) numbers[i] = Integer.parseInt(temp[i + 1]);

            dfs(0, 0);

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void dfs(int start, int end) {
        if (end == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        if (start == k) return;

        ans[end] = numbers[start];
        dfs(start + 1, end + 1);
        dfs(start + 1, end);
    }
}
