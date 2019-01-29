package level_02.jobs_033;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-01-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int s = Integer.parseInt(temp[1]);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) sb.append(" ");
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < (i << 1) - 1; j++) {
                line.append(s);
                s = ++s == 10 ? 1 : s;
            }

            if (i % 2 == 1) sb.append(line.reverse());
            else sb.append(line);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
